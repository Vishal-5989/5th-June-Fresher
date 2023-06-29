package org.example;
import java.sql.*;

public class ProgramThird {
    static final String user = "com.mysql.cj.jdbc.Driver";
    static final String pathDb = "jdbc:mysql://localhost:3306/prac26";
    static final String userid = "root";
    static final String password = "dere@123";
    public static void demoJdbc()
    {
        try {
            Class.forName(user);
            Connection connection = DriverManager.getConnection(pathDb, userid, password);

            PreparedStatement preparedStatement = connection.prepareStatement("select * from prd");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
            connection.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

    }
}
