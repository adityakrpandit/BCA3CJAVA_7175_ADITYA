import java.sql.*;
import java.util.*;
class insert
{
    public static void main(String[] args) {
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root", "");
            Statement stmt=cn.createStatement();
            Scanner sc=new  Scanner(System.in);
            int grno=0;
            String name="";
            System.out.println("Enter grno.");
            grno=sc.nextInt();
            System.out.println("Enter name");
            name=sc.next();

            try
            {
                int x=stmt.executeUpdate("insert into stud values("+grno+",'"+name+"')");
                System.out.println("No of row inserted : " +x);
            }
            catch(Exception e)
            {
                System.out.println("Exception : "+e);
            }
            cn.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}