package org.example;




import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

 public class JdbcTest {


         static String url = "com.mysql.cj.jdbc.Driver";

         static String pathDB = "jdbc:mysql://localhost:3306/db";

         static String user = "root";

         static String password = "Sulakshana@1197";

         public static void test() {

             try {
                 Class.forName(url);
                 Connection conn = DriverManager.getConnection(pathDB, user, password);
                 Statement st = conn.createStatement();


                 // String query1 = "select * from EmployeeDetails";
                 // String query = "INSERT INTO EmployeeDetails VALUES (02, 'Chaya', 'chaya@123', 2222, 'Mumbai')";
                 //st.executeUpdate(query);
                 //System.out.println("inserted successfully");


                 //String query = "select * from EmployeeDetails";
                 //String query1 = "INSERT INTO EmployeeDetails VALUES (03, 'Maya', 'maya@123', 33333, 'Hydrabad')";
                 //st.executeUpdate(query1);
                 //System.out.println("inserted successfully");



                 //String query = "select * from EmployeeDetails";
                 //String query = "INSERT INTO EmployeeDetails VALUES (04, 'Saya', 'saya@123', 4444, 'Tamilnadu')";
                 //st.executeUpdate(query);
                 //System.out.println("inserted successfully");

                 String query = "INSERT INTO EmployeeDetails VALUES (05, 'Naya', 'naya@123', 5555, 'Delhi')";
                 st.executeUpdate(query);
                 System.out.println("inserted successfully");



                //st.executeUpdate();
//                ResultSet rs = st.executeQuery(query1);
//                 while (rs.next()) {
//                     System.out.println(rs.getInt(1) + "  " + rs.getString(2) + " "
//                 +rs.getString(3)+ " "+ rs.getString(4)+" "+rs.getString(5));
//                 }


                 conn.close();



             } catch (ClassNotFoundException | SQLException e) {
                 throw new RuntimeException(e);
             }
         }

 }

