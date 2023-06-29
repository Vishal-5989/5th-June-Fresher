package org.example;

import java.sql.*;

public class ProgramSixthDelete {
      String url = "com.mysql.cj.jdbc.Driver";
      String pathDB = "jdbc:mysql://localhost:3306/pradipdb1";
      String user = "root";

      String password = "root";

      public void clauses()
      {
          try {
              Class.forName(url);
              Connection connection = DriverManager.getConnection(pathDB, user, password);
              Statement statement = connection.createStatement();
//              String query = "DELETE FROM emp WHERE EmpId = 6";
//              statement.executeUpdate(query);
              System.out.println("data deleted successfully");
              System.out.println("the code for deleted data has commented out please go to the program and make it uncomment ");
              String query1 = "SELECT * FROM emp";
              ResultSet resultSet = statement.executeQuery(query1);
              while (resultSet.next()){
                  System.out.println(resultSet.getInt(1)+" | "+
                          resultSet.getString(2)+" | "+
                          resultSet.getInt(3)+" | "+
                          resultSet.getString(4));
              }
              connection.close();
          } catch (ClassNotFoundException e) {
              throw new RuntimeException(e);
          } catch (SQLException e) {
              throw new RuntimeException(e);
          }
      }
}
