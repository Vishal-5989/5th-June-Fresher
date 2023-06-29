package MavenPro;

import java.sql.*;
import java.util.Scanner;

public class Database {
    public static void insert(Connection con){
        System.out.println("------------Data Insert-------------");
        String first = "insert into emp_info(emp_id, emp_name, department, package) values(?, ?, ?, ?)";
        try {
            PreparedStatement PS = con.prepareStatement(first);
            PS.setInt(1,102);
            PS.setString(2,"Rutuja");
            PS.setString(3,"Devops");
            PS.setInt(4,6);
            PS.executeUpdate();
            PS.close();
            String second = "insert into emp_info(emp_id, emp_name, department, package,mail_id) values(?, ?, ?, ?,?)";
            PreparedStatement PD = con.prepareStatement(second);
            PD.setInt(1,103);
            PD.setString(2,"Radha");
            PD.setString(3,"marketing");
            PD.setInt(4,6);
            PD.setString(5,"radha34@gmail.com");

            PD.executeUpdate();
            PD.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public  static  void update(Connection con){
        try {
            System.out.println("------------Data Update-------------");
            String first = "Upadte emp_info set emp_Name = ? where emp_id = ?";
            PreparedStatement PS = con.prepareStatement(first);
            PS.setString(1,"Mihika");
            PS.setInt(2, 101);
            PS.executeUpdate();
            PS.close();
        } catch (Exception e) {
            System.out.println(e);

        }
    }
    public  static  void delete(Connection con){
        try {
            System.out.println("------------Delete Data-------------");
            String first = "Delete from emp_info where emp_id = ?";
            PreparedStatement PS = con.prepareStatement(first);
            PS.setInt(1,2);
            PS.executeUpdate();
            System.out.println("------------Alter-------------");
            String sec = "Alter table emp_info add mail_id varchar(30)";
            PreparedStatement pd = con.prepareStatement(sec);
            pd.executeUpdate();
            pd.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public  static  void fetch(Connection con){
        System.out.println("------------fetching data-------------");
        try {
            Statement st = con.createStatement();
            String first = "select * from emp_info";
            //String oneCN = "select emp_id from emp info";

            ResultSet RS = st.executeQuery(first);
            while (RS.next()){
                int id = RS.getInt("emp_id");
                String name = RS.getString("emp_name");
                String dep = RS.getString("department");
                System.out.println("emp_id :: "+id+" :: emp_name :: "+name+" "+" :: department :: "+dep);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public  static  void  clauses(Connection con){
        try {
            Statement st = con.createStatement();
            System.out.println("------------Order By -------------");
            ResultSet rs= st.executeQuery("SELECT emp_name from emp_info order by emp_name desc;");
            while (rs.next()){
                System.out.println(rs.getString("emp_name"));
            }
            System.out.println("------------Group By-------------");
            ResultSet RS =st.executeQuery("SELECT SUM(package), department from emp_info group by department;");
            while (RS.next()) {
                System.out.println(RS.getString("department")+RS.getString("SUM(package)"));
            }

            System.out.println("------------Having-------------");
            ResultSet have = st.executeQuery("SELECT count(emp_id), emp_name FROM emp_info GROUP BY emp_name HAVING count(emp_id)<2 ;");

            while (have.next()){
                System.out.println(have.getString("count(emp_id)")+" "+have.getString("emp_name"));
            }

        } catch (Exception e) {
            System.out.println(e);

        }
    }
    public  static  void joins(Connection con){
        try {
            Statement st = con.createStatement();
            System.out.println("------------Inner Join-------------");
            ResultSet rs = st.executeQuery("select * from table1 inner join table2 on table1.id = table2.id;");
            while (rs.next()){
                System.out.println(rs.getInt("table1.id")+"::"+rs.getString("table1.username")+"::"+rs.getInt("table2.id")+"::"+rs.getString("table2.pass"));
            }
            System.out.println("------------left Join-------------");
            ResultSet rd = st.executeQuery("select * from table1 left join table2 on table1.id = table2.id;");
            while (rd.next()){
                System.out.println(rd.getInt("table1.id")+"::"+rd.getString("table1.username")+"::"+rd.getInt("table2.id")+"::"+rd.getString("table2.pass"));
            }
            System.out.println("------------Right Join-------------");
            ResultSet r = st.executeQuery("select * from table1 Right join table2 on table1.id = table2.id;");
            while (r.next()){
                System.out.println(r.getInt("table1.id")+"::"+r.getString("table1.username")+"::"+r.getInt("table2.id")+"::"+r.getString("table2.pass"));
            }
            System.out.println("------------Cross Join-------------");
            ResultSet cr = st.executeQuery("select * from table1 Cross join table2 on table1.id = table2.id;");
            while (cr.next()){
                System.out.println(cr.getInt("table1.id")+"::"+cr.getString("table1.username")+"::"+cr.getInt("table2.id")+"::"+cr.getString("table2.pass"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
    }
    public  static  void operators(Connection con){
        try {
            Statement st = con.createStatement();
            System.out.println("------------In keyword-------------");
            ResultSet rs= st.executeQuery("SELECT emp_name,package from emp_info where package IN(4,5,8);");
            while (rs.next()){
                System.out.println(rs.getString("emp_name")+":"+rs.getInt("package"));
            }
            System.out.println("------------NOT IN-------------");
            ResultSet NI= st.executeQuery("SELECT emp_name from emp_info where package not IN(4,6);");
            while (NI.next()){
                System.out.println(rs.getString("emp_name")+":"+rs.getInt("package"));
            }
            System.out.println("------------Like-------------");
            ResultSet like = st.executeQuery("SELECT emp_name from emp_info where emp_name like '%u%';");
            while (like.next()){
                System.out.println(rs.getString("emp_name")+":"+rs.getInt("package"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        try {
            String driver ="com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/demo";
            String Username = "root";
            String password = "Asmita@2212";
            //step 1
            Class.forName(driver);
            //step 2
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root","Asmita@2212" );
            int choice;
            do{
                System.out.println("Enter choice");
                System.out.println("0)exists \n1)Insert data in Database");
                System.out.println("2)update data in database");
                System.out.println("3)Delete data in database");
                System.out.println("4)fetch data");
                System.out.println("5)clauses");
                System.out.println("6)joins");
                System.out.println("7)Operators");
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter choice:");
                choice = sc.nextInt();

                switch (choice){
                    case 1:
                        insert(con);
                        break;
                    case 2:
                        update(con);
                        break;
                    case 3:
                        delete(con);
                        break;
                    case 4:
                        fetch(con);
                        break;
                    case 5:
                        clauses(con);
                        break;
                    case 6:
                        joins(con);
                        break;
                    case 7:
                        operators(con);
                        break;
                    default:
                        System.out.println("Please select correct choice");
                }

            }while (choice!=0);

        } catch (Exception e) {
            System.out.println(e);

        }

    }
}
