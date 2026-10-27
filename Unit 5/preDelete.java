import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

class preDelete {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc_prg", "root", ""
            );

            String sql = "DELETE FROM stud WHERE grno = ?";
            PreparedStatement pstmt = cn.prepareStatement(sql);

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter grno to be deleted: ");
            int grno = sc.nextInt();

            pstmt.setInt(1, grno);

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