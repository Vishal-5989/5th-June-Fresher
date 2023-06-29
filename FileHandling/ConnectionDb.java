import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionDb {
    public static void main(String[] args)
    {
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/neutrino","root","root");
            PreparedStatement stmt=con.prepareStatement("insert into Student values(?,?)");
           // stmt.setInt(1,101);
            //stmt.setString(2,"Ratan");

           // int i=stmt.executeUpdate();
            //System.out.println(i+" records inserted");

            //Update
            PreparedStatement update=con.prepareStatement("update student set name=? where id = ?");
            update.setInt(1,4);
            update.setString(2,"tina");

            int k=stmt.executeUpdate();
            System.out.println(k+" records updated");

           // Delete
            PreparedStatement delete=con.prepareStatement("delete from emp where id=?");
            delete.setInt(1,101);

            int j=stmt.executeUpdate();
            System.out.println(j+" records deleted");

            //select

            PreparedStatement select=con.prepareStatement("select * from emp");
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }

            con.close();

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
