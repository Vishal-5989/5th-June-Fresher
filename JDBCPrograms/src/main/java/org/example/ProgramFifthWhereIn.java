package org.example;

import java.sql.*;

public class ProgramFifthWhereIn {

    static  String url = "com.mysql.cj.jdbc.Driver";
    static  String pathDB = "jdbc:mysql://localhost:3306/pradipdb1";
    static  String user = "root";

    static  String password = "root";

    public static void whereClause()
    {
        try {
            Class.forName(url);
            Connection connection = DriverManager.getConnection(pathDB, user, password);
            Statement statement = connection.createStatement();
            String query = "SELECT name FROM company WHERE sal IN (2000, 4000, 5000)";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.println(resultSet.getString(1));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
