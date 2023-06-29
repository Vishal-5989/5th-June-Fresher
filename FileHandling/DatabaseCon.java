import java.sql.*;

public class DatabaseCon {

    public static void main(String[] args)  {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/neutrino", "root", "root");
            System.out.println("Connection is done");

            Statement st = con.createStatement();
//Select
            String query =  "select * from student";
            st.executeQuery(query);
//Update
            String update =  "insert into student values(05,'mona')";
            st.executeUpdate(update);
//Delete
            String delete = "delete from student where id=04 ";
            //st.executeUpdate(delete);


           ResultSet re = st.executeQuery(query);
            while (re.next()) {
                System.out.println(re.getInt("id") + "\t" + re.getString("name"));
            }
            System.out.println("Table is done");

            con.close();
        }catch(Exception e){
            System.out.println("error");
            e.printStackTrace();
        }

    }
}
