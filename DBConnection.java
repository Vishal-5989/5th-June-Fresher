package SQL;
import java.sql.*;

public class DBConnection
{
    public static Connection getConnection()
    {
        Connection connection = null;

        try
        {
            Class.forName(".com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Ross@0909");


        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return connection;
    }


}
