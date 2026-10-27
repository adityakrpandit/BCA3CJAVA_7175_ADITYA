import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

class preInsert {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc_prg", "root", ""
            );


            String sql = "INSERT INTO stud (grno, name) VALUES (?, ?)";
            PreparedStatement pstmt = cn.prepareStatement(sql);

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter grno: ");
            int grno = sc.nextInt();

            System.out.print("Enter name: ");
            String name = sc.next();

            pstmt.setInt(1, grno);
            pstmt.setString(2, name);

            int x = pstmt.executeUpdate();

            System.out.println("No of rows inserted: " + x);

            pstmt.close();
            cn.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}