package com.demo.test;

import java.sql.*;

public class CollableStatement {

    public static void main(String[] args) {
        try {

            //Using Stored Procedure

            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            String url="jdbc:mysql://localhost:3306/db1?useSSL=false";
            String username="root";
            String password="root";
            Connection con=DriverManager.getConnection(url,username,password);
            CallableStatement cst=con.prepareCall("call pro4(?,?)");
            int para1=10;
            cst.setInt(1,para1);
            cst.registerOutParameter(2, Types.INTEGER);
            cst.execute();
            int para2=cst.getInt(2);
            System.out.println("number of employees in deptno : 10 -->\n"+ para2);
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
