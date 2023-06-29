import java.sql.*;

public class Sqlclauses {
    public static void main(String args[]){

        String url = "com.mysql.cj.jdbc.Driver";
        String dbpath ="jdbc:mysql://localhost:3306/employees";
        String  username = "root";
        String  password = "Shubham@123";

        String insertquery = "insert into employees values(9,'kapil raut',26,'IT Admin',3000000)";

        try {
            Class.forName(url);
            Connection connection = DriverManager.getConnection(dbpath,username,password);
            Statement statement = connection.createStatement();
            statement.executeUpdate(insertquery);
            System.out.println("Data Inserted Succesfully....");

            connection.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
