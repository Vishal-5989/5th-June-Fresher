package org.example;

import java.sql.*;

public class Joins {

    static String url = "com.mysql.cj.jdbc.Driver";

    static String pathDB = "jdbc:mysql://localhost:3306/db";

    static String user = "root";

    static String password = "Sulakshana@1197";

    public static void join(){

         try {
            Class.forName(url);
            Connection conn = DriverManager.getConnection(pathDB, user, password);
            Statement st = conn.createStatement();

            //Cross Join
           // ResultSet rs = st.executeQuery("Select EmployeeDetails.EmpName, Department.DeptName from EmployeeDetails Cross Join Department;");
           // System.out.println("Here Is Your Cross Join Output....");


           //Inner Join
            //ResultSet rs = st.executeQuery("Select EmployeeDetails.EmpName from EmployeeDetails Inner Join Department ON EmployeeDetails.EId= Department.EId;");
            //System.out.println("Here Is Your Inner Join Output....");

             //Full Outer Join
             ResultSet rs = st.executeQuery("Select EmployeeDetails.EmpName from EmployeeDetails Full Outer Join Department ON EmployeeDetails.EId = Department.EId;");
             System.out.println("Here Is Your Full Outer Join Output....");


             while (rs.next()){
                System.out.println(rs.getString("EmpName"));
            }
            conn.close();

        }
         catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}



