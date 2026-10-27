import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class preDisplay {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc_prg", "root", ""
            );

            String sql = "SELECT * FROM stud";
            PreparedStatement pstmt = cn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getInt("grno") + " " +
                    rs.getString("name")
                );
            }

            rs.close();
            pstmt.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}