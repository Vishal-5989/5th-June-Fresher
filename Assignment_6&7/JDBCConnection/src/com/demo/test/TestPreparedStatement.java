package com.demo.test;

import java.sql.*;

public class TestPreparedStatement {
    public static void main(String[] args) {
        try{

            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());  //Register the driver
            String url="jdbc:mysql://localhost:3306/db1?useSSL=false";     //Url for database connection
            String username="root";                                        //Username of database
            String password="root";                                        //Password of database
            Connection con= DriverManager.getConnection(url,username,password);  //Get the connections

            //Retrive the data from database
            String query="select * from dept";                              //Fire the query
            PreparedStatement ps=con.prepareStatement(query);               //Use of prepared statement because its secured statement
            ResultSet rs=ps.executeQuery();                                 //Execute statement
            System.out.println("Using Prepared Statement \n");
            while(rs.next()){
                System.out.println("DeptNo :"+rs.getInt(1));
                System.out.println("Department Name :"+rs.getString(2));
                System.out.println("Location :"+rs.getString(3));           //Processing the data for print whatever data from database
                System.out.println("Password :"+rs.getString(4));
                System.out.println("Started Date :"+rs.getString(5));
                System.out.println("-------------------------------------------------");
            }

            //Insert the data in database
            int deptno=200;
            String dname="Product";
            String loc="Pune";
            String pwd="Pune@123";
            String startedon="22/05/2023";
            PreparedStatement ps1=con.prepareStatement("insert into dept values(?,?,?,?,?)");
            ps1.setInt(1,deptno);
            ps1.setString(2,dname);
            ps1.setString(3,loc);
            ps1.setString(4,pwd);
            ps1.setString(5,startedon);
            int n=ps1.executeUpdate();

            if (n>0){
                System.out.println("Data inserted successfully...");
            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
