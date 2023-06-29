package org.example;
import java.sql.*;
public class FirstProgram {
    static String url = "com.mysql.cj.jdbc.Driver";
    static String pathDB = "jdbc:mysql://localhost:3306/prac26";
    static String user = "root";
    static  String password = "dere@123";

    public static void test(){
        try {
            Class.forName(url);
            Connection con =DriverManager.getConnection(pathDB,user,password);
            Statement st = con.createStatement();
            String query = "Select * from prd";
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
            con.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
