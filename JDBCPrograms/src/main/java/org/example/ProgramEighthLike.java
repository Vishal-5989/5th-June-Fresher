package org.example;

import java.sql.*;

public class ProgramEighthLike {
    String url = "com.mysql.cj.jdbc.Driver";
    String pathDB = "jdbc:mysql://localhost:3306/pradipdb1";
    String user = "root";

    String password = "root";

    public  void like(){
        try {
            Class.forName(url);
            Connection connection = DriverManager.getConnection(pathDB, user, password);
            Statement statement = connection.createStatement();
            String query = "SELECT EmpName FROM emp WHERE EmpNAme LIKE 'S%'";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.println(resultSet.getString(1));
            }
            connection.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
