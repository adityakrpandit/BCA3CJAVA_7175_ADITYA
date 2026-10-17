import java.sql.*;
class Display 
{
    public static void main(String[] args) {
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root", "");
            Statement stmt=cn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from stud");
            while (rs.next()) {
                
                System.out.println(rs.getInt("grno")+"  "+rs.getString("name"));
            }
            cn.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }  
}