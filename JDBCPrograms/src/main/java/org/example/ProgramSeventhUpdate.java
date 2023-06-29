package org.example;

import java.sql.*;

public class ProgramSeventhUpdate {
    String url = "com.mysql.cj.jdbc.Driver";
    String pathDB = "jdbc:mysql://localhost:3306/pradipdb1";
    String user = "root";

    String password = "root";

    public void update() {
        try {
            Class.forName(url);
            Connection connection = DriverManager.getConnection(pathDB, user, password);
            Statement statement = connection.createStatement();
            String query = "UPDATE emp set EmpName = 'Pradya' WHERE EmpId = 1";
//            statement.executeUpdate(query);
//            System.out.println("Updated data succesfully....");
            String query1 = "select * from emp";
            ResultSet rs = statement.executeQuery(query1);
            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+
                        rs.getInt(3)+" "+rs.getString(4));
            }
            connection.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
