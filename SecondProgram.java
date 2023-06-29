package org.example;
import java.sql.*;

public class SecondProgram {
    static String url = "com.mysql.jdbc.Driver";
    static String dbpath = "jdbc:mysql://localhost:3306/prac26";
    static String user = "root";
    static String password = "dere@123";

    public static void demo()
    {
        try {
            Class.forName(url);
            Connection con = DriverManager.getConnection(dbpath, user, password);
            Statement st = con.createStatement();
            String query = "INSERT INTO edet VALUES (4, 'Zara', 18)";
            st.executeUpdate(query);
            String query2 = "select * from edet";
            ResultSet result = st.executeQuery(query2);
            while (result.next())
            {
                System.out.println(result.getInt(1)+" "+result.getString(2)+" "+
                        result.getInt(3));
            }
            con.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
