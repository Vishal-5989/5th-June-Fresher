package org.example;

import java.sql.*;

public class ProgramNineBetween {
    String url = "com.mysql.cj.jdbc.Driver";
    String pathDB = "jdbc:mysql://localhost:3306/pradipdb1";
    String user = "root";

    String password = "root";

    public void between(){
        try {
            Class.forName(url);
            Connection connection = DriverManager.getConnection(pathDB, user, password);
            Statement statement = connection.createStatement();
            String query = "Select EmpName from emp where EmpAge Between 20 and 25";
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
