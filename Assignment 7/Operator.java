package org.example;

import java.sql.*;

public class Operator {

            static String url = "com.mysql.cj.jdbc.Driver";

            static String pathDB = "jdbc:mysql://localhost:3306/db";

            static String user = "root";

            static String password = "jYOTI@1993";

            public static void test3() {
                try {
                    Class.forName(url);//
                    Connection conn = DriverManager.getConnection(pathDB, user, password);
                    Statement st = conn.createStatement();

                    //ResultSet rs=st.executeQuery("Select E_Name From Employee order by E_Name");
                    //ResultSet rs=st.executeQuery("Select E_Name From Employee where E_id Between 1 and 4");
                    //ResultSet rs=st.executeQuery("Select E_Name From Employee where E_id Not Between 1 and 4");
                    //ResultSet rs=st.executeQuery("Select E_Name From Employee where E_id Not in (1,4)");
                    //ResultSet rs=st.executeQuery("Select E_Name From Employee where E_id  in (1,4)");
                   // ResultSet rs=st.executeQuery("Select E_Name From Employee where E_Name like '%a____%'");
                    // ResultSet rs=st.executeQuery("Select E_Name From Employee where E_Name Not like '%a____%'");
                    //ResultSet rs=st.executeQuery("Select e.E_Name,e.E_Id,d.Dept_Name from Employee e Right Join Dept d on e.E_id = d.E_id");
                    //ResultSet rs=st.executeQuery("Select e.E_Name,e.E_Id,d.Dept_Name from Employee e Left Join Dept d on e.E_id = d.E_id");
                    //ResultSetrs=st.executeQuery("Select e.E_Name,e.E_Id,d.Dept_Name from Employee e inner Join Dept d on e.E_id = d.E_id");
                    //ResultSet rs=st.executeQuery("Select e.E_Name,e.E_Id,d.Dept_Name from Employee e inner Join Dept d on e.E_id = d.E_id");
                    //ResultSet rs=st.executeQuery(" select count(E_Location),E_Name,E_Id from Employee Group by E_Location,E_Name,E_Id");
                    ResultSet rs=st.executeQuery(" select count(E_Location),E_Name,E_Id from Employee Group by E_Location,E_Name,E_Id Having E_id =1; ");








                    System.out.println("ordered Successfully");

                    while (rs.next()) {
                       // System.out.println(rs.getInt("E_location"));
                        System.out.println(rs.getString("E_name"));
                        System.out.println(rs.getInt("E_ID"));
                        //System.out.println(rs.getString("Dept_Name"));
                        System.out.println( "                ");
                    }

                    conn.close();
                } catch (ClassNotFoundException | SQLException e) {
                    throw new RuntimeException(e);
                }


            }

     }










