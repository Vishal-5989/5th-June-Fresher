package org.example;

        import java.sql.*;
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.ResultSet;
        import java.sql.Statement;



public  class InsertStatement {

    static class SecondProgram{
        static String url = "com.mysql.jdbc.Driver";

        static String pathDB = "jdbc:mysql://localhost:3306/db";

        static String user = "root";

        static String password = "jYOTI@1993";

        public static void test1() {
            try {
                Class.forName(url);//
                Connection conn = DriverManager.getConnection(pathDB, user, password);
                Statement st = conn.createStatement();
                //String query = "insert into student values(5,'Sagar')";

                //st.executeUpdate(query);


                String query = "Insert into Employee values(11,'Kartik','Delhi','Kartik@2345',45000)";
                st.executeUpdate(query);
                System.out.println("Inserted Successfully");

                //ResultSet rs = st.executeQuery(query);


                conn.close();
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }


        }

    }








}