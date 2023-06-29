import java.sql.*;

public class Groupby {
    public static void main(String args[]){

        String url = "com.mysql.cj.jdbc.Driver";
        String dbpath ="jdbc:mysql://localhost:3306/employees";
        String  username = "root";
        String  password = "Shubham@123";

        String selectquery = "Select count(*), name from employees group by name";

        try {
            Class.forName(url);
            Connection connection = DriverManager.getConnection(dbpath,username,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectquery);
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));
            }

            connection.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
