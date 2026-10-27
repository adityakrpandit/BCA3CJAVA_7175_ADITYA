import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

class preUpdate {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc_prg", "root", ""
            );

            String sql = "UPDATE stud SET name = ? WHERE grno = ?";
            PreparedStatement pstmt = cn.prepareStatement(sql);

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter grno to be updated: ");
            int grno = sc.nextInt();

            System.out.print("Enter new name: ");
            String name = sc.next();

            pstmt.setString(1, name);
            pstmt.setInt(2, grno);

            int x = pstmt.executeUpdate();

            System.out.println("No of rows affected: " + x);

            pstmt.close();
            cn.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}