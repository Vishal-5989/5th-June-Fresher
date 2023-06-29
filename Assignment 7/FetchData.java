package org.example;

import java.sql.*;


public  class FetchData {

    static class ThirdProgram {
        static String url = "com.mysql.jdbc.Driver";

        static String pathDB = "jdbc:mysql://localhost:3306/db";

        static String user = "root";

        static String password = "jYOTI@1993";

        public static void test2 () {
            try {
                Class.forName(url);//
                Connection conn = DriverManager.getConnection(pathDB, user, password);
                Statement st = conn.createStatement();
                String query = "Select * from Employee;";
                ResultSet rs=st.executeQuery(query);
                while (rs.next()){
                    System.out.println("E_id "+rs.getInt(1));
                    System.out.println("E_Name "+rs.getString(2));
                    System.out.println("E_Location "+rs.getString(3));
                    System.out.println("Mail_id "+rs.getString(4));
                    System.out.println("Salary "+rs.getInt(5));
                    System.out.println("                           ");
                }



                conn.close();
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }


        }

    }

}