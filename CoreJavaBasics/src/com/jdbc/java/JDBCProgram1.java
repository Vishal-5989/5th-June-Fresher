package com.jdbc.java;

import java.sql.*;

public class JDBCProgram1 {
    static  final String DB_address = "jdbc:mysql://localhost/3306/PradipDB";
    static  final String userName = "root";
    static  final String password = "1234";
    static  final  String query = "select id FROM emp";

    public static void main(String[] args) {

        try {
            Class.forName();

            Connection con = DriverManager.getConnection(DB_address, userName, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
