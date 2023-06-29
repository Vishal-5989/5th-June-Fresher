package org.example;

import java.sql.*;

public class ProgramFirstAsterisk {
    static  String url = "com.mysql.cj.jdbc.Driver";
    static  String pathDB = "jdbc:mysql://localhost:3306/pradipdb1";
    static  String user = "root";

    static  String password = "root";

    public static  void test()
    {
        try {
            Class.forName(url);//
            Connection conn = DriverManager.getConnection(pathDB, user, password);
            Statement st = conn.createStatement();

            String query = "select * from emp";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "
                +rs.getString(4));
            }
            conn.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
