package org.example;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class JdbcTest {



    static class FirstProgram {
         static  String url = "com.mysql.jdbc.Driver";

         static String pathDB = "jdbc:mysql://localhost:3306/sys";

         static String user = "root";

         static String password ="jYOTI@1993";

         public static void test()
         {
             try{
                 Class.forName(url);//
                 Connection conn = DriverManager.getConnection(pathDB, user, password);
                 Statement st = conn.createStatement();
                 //String query = "insert into student values(5,'Sagar')";
                 //String query = "insert into student values(6,'Shyam')";
                 //String query =  "insert into student values(7,'Sara')";
                // st.executeUpdate(query);


                 String query = "select * from student";

                 ResultSet rs = st.executeQuery(query);

                 //while (rs.next()) {
                    // System.out.println(rs.getInt(1)+" "+rs.getString(2)+"");
                 //}
                 conn.close();
             } catch (ClassNotFoundException e){
                 throw new RuntimeException(e);
             }catch (SQLException e){
                 throw new RuntimeException(e);
             }


         }
         





         }



    }

