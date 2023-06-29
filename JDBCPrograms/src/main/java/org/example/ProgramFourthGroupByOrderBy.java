package org.example;

import java.sql.*;

public class ProgramFourthGroupByOrderBy {
    static  String url = "com.mysql.cj.jdbc.Driver";
    static String dbpath = "jdbc:mysql://localhost:3306/pradipdb1";
    static  String user = "root";
    static  String password = "root";


    public static void groupBy()
    {
        try {
            Class.forName(url);

            Connection conn = DriverManager.getConnection(dbpath, user, password);
            String query = "SELECT sum(sal) FROM company GROUP BY sal ORDER BY sal DESC";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                System.out.println(rs.getInt(1));
            }
            conn.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
