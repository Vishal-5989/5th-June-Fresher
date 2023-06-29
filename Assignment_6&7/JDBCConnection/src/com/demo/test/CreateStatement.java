package com.demo.test;

import java.sql.*;

public class CreateStatement {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());       //Register the driver
            String url="jdbc:mysql://localhost:3306/db1?useSSL=false";         //Define the url
            String username="root";                                             //Database name
            String password="root";                                             //Database Password
            Connection con=DriverManager.getConnection(url,username,password);  //Get the connections
            Statement st=con.createStatement();                                  //Using Create statement
                                                                                //Create statement is less secure and its most honarable statement
            ResultSet rs=st.executeQuery("select * from dept");             //Execute statement
            System.out.println("Using Create Statement \n");
            while(rs.next()){
                System.out.println("DeptNo :"+rs.getInt(1));
                System.out.println("Department Name :"+rs.getString(2));
                System.out.println("Location :"+rs.getString(3));
                System.out.println("Password :"+rs.getString(4));
                System.out.println("Started Date :"+rs.getString(5));
                System.out.println("---------------------------------------------------");
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
