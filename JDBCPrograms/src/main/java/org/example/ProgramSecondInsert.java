package org.example;

import java.sql.*;

public class ProgramSecondInsert {

    static  String url = "com.mysql.cj.jdbc.Driver";
    static String dbpath = "jdbc:mysql://localhost:3306/pradipdb1";
    static  String user = "root";
    static  String password = "root";

    public  static  void demo()
    {
        try {
            Class.forName(url);
            Connection con = DriverManager.getConnection(dbpath, user, password);
            Statement st = con.createStatement();
            String query = "INSERT INTO emp VALUES (6, 'Zara', 18, 'automation')";
            st.executeUpdate(query);
            String query2 = "select * from emp";
            ResultSet result = st.executeQuery(query2);
            while (result.next())
            {
                System.out.println(result.getInt(1)+" "+result.getString(2)+" "+
                        result.getInt(3)+" "+result.getString(4));
            }
            con.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
