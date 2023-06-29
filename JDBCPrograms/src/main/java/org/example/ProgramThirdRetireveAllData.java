package org.example;

import java.sql.*;

public class ProgramThirdRetireveAllData
{

    static final  String user = "com.mysql.cj.jdbc.Driver";
    static final String pathDb = "jdbc:mysql://localhost:3306/pradipdb1";
    static final String userid = "root";
    static final String password = "root";
    public static  void demoJdbc()
    {
        try {
            Class.forName(user);
            Connection connection = DriverManager.getConnection(pathDb, userid, password);

            PreparedStatement preparedStatement = connection.prepareStatement("select * from emp");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+
                        rs.getInt(3)+" "+rs.getString(4));
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
