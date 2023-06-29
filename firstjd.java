import java.sql.Connection;
import java.sql.DriverManager;

public class firstjd  {
    public static void main(String[] args){
        try {
            // Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Creating Connection
            String url = "jdbc:mysql://localhost:3306/company";
            String username = "root";
            String password = "Shubham@123";
            Connection con = DriverManager.getConnection(url,username,password);
            if(con.isClosed()){
                System.out.println("Connection is closed");
            }
            else{
                System.out.println("connection created..");
            }


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
