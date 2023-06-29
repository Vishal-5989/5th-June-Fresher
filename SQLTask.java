package jdbc_example;

import java.sql.*;
import java.util.Scanner;

public class SQLTask {
    public static void insert(Connection con) {
        try {
            String s = "Insert into employee(employeeName,id,salary) values(?,?,?)";
            Scanner c = new Scanner(System.in);
            System.out.println("Enter the employee name:");
            String employeeName = c.next();
            System.out.println("Enter employee id:");
            int id = c.nextInt();
            System.out.println("Enter salary of employee:");
            double salary = c.nextDouble();
            PreparedStatement st = con.prepareStatement(s);
            st.setString(1, employeeName);
            st.setInt(2, id);
            st.setDouble(3, salary);

            int rowsInserted = st.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("new records added successfully.");
            }

        } catch (Exception e) {
            System.out.println("Some error occurred.");
            e.printStackTrace();
        }

    }
    public static void update(Connection con) {
        try {
            String query = "update employee set id=23 where employeeName='Asmita'";
            Statement st=con.createStatement();
            st.executeUpdate(query);
            System.out.println("Updation of data successfully.");
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public static void delete(Connection con) {
        try {
            Statement st=con.createStatement();
            String query = "delete from employee where id=8";
            st.executeUpdate(query);
            System.out.println("Deletion of data successfully.");

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void show(Connection con) {
        try {
            Statement mystatement = con.createStatement();
            ResultSet result = mystatement.executeQuery("select * from employee");
            while (result.next()) {
                System.out.println(result.getString("employeeName") + " \t " + result.getInt("id") + " \t " + result.getDouble("salary"));

            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
public static void allClause(Connection con){
    try {

        System.out.println("-------------------------------------------");
        System.out.println("Order by clause: ");
        System.out.println("-------------------------------------------");
        Statement st=con.createStatement();
        /*String query = "select* from employee order by id desc";
       PreparedStatement s=con.prepareStatement(query);*/
       ResultSet rs=st.executeQuery("select* from employee order by id desc;");
       while(rs.next()){
           System.out.println(rs.getString("employeeName") + " \t " + rs.getInt("id") + " \t " + rs.getDouble("salary"));

       }
        System.out.println("-------------------------------------------");
        System.out.println("Group By clause:");
        System.out.println("-------------------------------------------");

        ResultSet rs1=st.executeQuery("select count(id) as totalId,employeeName from employee group by employeeName\n");
        while(rs1.next()){
            System.out.println( rs1.getInt("totalId")+"\t"+rs1.getString("employeeName"));

        }
        System.out.println("-------------------------------------------");
        System.out.println("Like clause:");
        System.out.println("-------------------------------------------");

        System.out.println("\nUsing %.");
        ResultSet rs2 = st.executeQuery("select* from employee where employeeName like's%'");
        while (rs2.next()) {
            System.out.println(rs2.getString("employeeName") + " \t " + rs2.getInt("id") + " \t " + rs2.getDouble("salary"));

        }
        System.out.println("\nUsing _ .");
        ResultSet result = st.executeQuery("select* from employee where employeeName like'___s__'");
        while (result.next()) {
            System.out.println(result.getString("employeeName") + " \t " + result.getInt("id") + " \t " + result.getDouble("salary"));

        }
        System.out.println("-------------------------------------------");
        System.out.println("Having clause:");
        System.out.println("-------------------------------------------");
        ResultSet rs3=st.executeQuery("SELECT COUNT(id) as totalId, employeeName FROM employee GROUP BY employeeName HAVING COUNT(id) >= 2");
        while(rs3.next()){
            System.out.println( rs3.getInt("totalId")+"\t"+rs3.getString("employeeName"));
        }
        System.out.println("--------------------------------------------");
    }catch(Exception e){
        e.printStackTrace();
    }
}
public static void join(Connection con){
    try {
        Statement st=con.createStatement();
        /*String query = "select employee.employeeName,employee.id ,department.hr,department.id from employee left join department on employee.id=department.id;\n";
        PreparedStatement s=con.prepareStatement(query);*/
        System.out.println("-----------------------------------");
        System.out.println("Left join.");
        System.out.println("-----------------------------------");
        ResultSet rs=st.executeQuery("select employee.employeeName,employee.id ,department.hr,department.id from employee left join department on employee.id=department.id;\n");

        while(rs.next()){
            System.out.println(rs.getString("employee.employeeName") + " \t " +rs.getInt("id")+"\t"+rs.getInt("employee.id")+"\t"+ rs.getString("department.hr") + " \t " + rs.getInt("department.id"));

        }
        System.out.println("-----------------------------------");
        System.out.println("Right join");
        System.out.println("-----------------------------------");

        ResultSet rs1=st.executeQuery("select employee.employeeName,employee.id ,department.hr,department.id from employee right join department on employee.id=department.id");

        while(rs1.next()){
            System.out.println(rs1.getString("employee.employeeName") + " \t " +rs1.getInt("id")+"\t"+rs1.getInt("employee.id")+"\t"+ rs1.getString("department.hr") + " \t " + rs1.getInt("department.id"));

        }
        System.out.println("-----------------------------------");
        System.out.println("full join");
        System.out.println("-----------------------------------");
        ResultSet rs2=st.executeQuery("select employee.employeeName,employee.id ,department.hr,department.id from employee right join department on employee.id=department.id");

        while(rs2.next()){
            System.out.println(rs2.getString("employee.employeeName") + " \t " +rs2.getInt("id")+"\t"+rs2.getInt("employee.id")+"\t"+ rs2.getString("department.hr") + " \t " + rs2.getInt("department.id"));

        }
        System.out.println("-----------------------------------");
        System.out.println("Self join");
        System.out.println("-----------------------------------");
        ResultSet rs3=st.executeQuery("select A.employeeName as employeeName1,B.employeeName as employeeName2,A.id as id1,B.id as id2 from employee A,employee B where A.salary=B.salary;");

        while(rs3.next()){
            System.out.println(rs3.getString("employeeName1") + " \t " +rs3.getString("employeeName2")+"\t"+rs3.getInt("id1")+"\t"+ rs3.getString("id2"));

        }
        System.out.println("-----------------------------------");
        System.out.println("Cross join");
        System.out.println("-----------------------------------");
        ResultSet rs4=st.executeQuery("select * from employee cross join department");

        while(rs4.next()){
            System.out.println(rs4.getString("employeeName") + "\t" +rs4.getInt("id")+"\t"+rs4.getDouble("salary")+"\t"+ rs4.getInt("id")+"\t"+rs4.getString("departmentName")+"\t"+rs4.getString("hr"));

        }
        System.out.println("-----------------------------------");
        System.out.println("Inner join.");
        System.out.println("-----------------------------------");
        ResultSet rs5=st.executeQuery("select employee.employeeName,employee.id ,department.hr,department.id from employee left join department on employee.id=department.id;\n");

        while(rs5.next()) {
            System.out.println(rs5.getString("employee.employeeName") + " \t " + rs5.getInt("id") + "\t" + rs5.getInt("employee.id") + "\t" + rs5.getString("department.hr") + " \t " + rs5.getInt("department.id"));

        }
        System.out.println("-----------------------------------");

    }catch(Exception e){
        e.printStackTrace();
    }

}
public static void in_Exists(Connection con){
    try {
        System.out.println("----------------------------------");
        System.out.println("using in clause");
        System.out.println("----------------------------------");

        Statement mystatement = con.createStatement();
        ResultSet result = mystatement.executeQuery("select *from employee where employeeName in('asmita','sakshi','Radha')");
        while (result.next()) {
            System.out.println(result.getString("employeeName") + " \t " + result.getInt("id") + " \t " + result.getDouble("salary"));

        }
        System.out.println("----------------------------------");
        System.out.println("using Not in clause");
        System.out.println("----------------------------------");

        ResultSet re = mystatement.executeQuery("select *from employee where employeeName Not in('asmita','sakshi','Radha')");
        while (re.next()) {
            System.out.println(re.getString("employeeName") + " \t " + re.getInt("id") + " \t " + re.getDouble("salary"));

        }
        System.out.println("----------------------------------");
        System.out.println("using Exists clause");
        System.out.println("----------------------------------");
        ResultSet re1 = mystatement.executeQuery("select *from employee where  exists (select* from department where departmentName='QA')");
        while (re1.next()) {
            System.out.println(re1.getString("employeeName") + " \t " + re1.getInt("id") + " \t " + re1.getDouble("salary"));

        }
        System.out.println("----------------------------------");
        System.out.println("using Not Exists clause");
        System.out.println("----------------------------------");
        ResultSet re2 = mystatement.executeQuery("select *from employee where not exists (select* from department where departmentName='QA')");
        while (re2.next()) {
            System.out.println(re2.getString("employeeName") + " \t " + re2.getInt("id") + " \t " + re2.getDouble("salary"));

        }

    }catch(Exception e){
        e.printStackTrace();
    }
}
public static void aggregateFunction(Connection con){
    try {
        System.out.println("----------------------------------");
        System.out.println("using Min Function ");
        Statement mystatement = con.createStatement();
        ResultSet result = mystatement.executeQuery("select min(salary) as minimumSalary  from employee;");
        while (result.next()) {

            System.out.println(result.getDouble("minimumSalary"));

        }
        System.out.println("...........................");
        System.out.println("using Max Function ");
        ResultSet re1 = mystatement.executeQuery("select max(salary) as maximumSalary  from employee");
        while (re1.next()) {

            System.out.println(re1.getDouble("maximumSalary"));
        }
        System.out.println("...........................");
        System.out.println("using Avg Function ");
        ResultSet re2 = mystatement.executeQuery("select Avg(salary) as AverageSalary  from employee;");
        while (re2.next()) {

            System.out.println(re2.getDouble("AverageSalary"));
        }
        System.out.println("...........................");
        System.out.println("using Sum Function ");
        ResultSet re3 = mystatement.executeQuery("select Sum(salary) as totalSalary  from employee;");
        while (re3.next()) {

            System.out.println(re3.getDouble("totalSalary"));
        }
        System.out.println("...........................");
        System.out.println("using Count Function ");
        ResultSet re4 = mystatement.executeQuery("select Count(employeename) as TotalCount from employee where id>4");
        while (re4.next()) {

            System.out.println(re4.getInt("TotalCount"));
        }

    }catch(Exception e){
        e.printStackTrace();
    }
}
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Rutuja@123");
            System.out.println("Connection is done.");

            Scanner c = new Scanner(System.in);

            int ch;
            do {
                System.out.println("0.exists\n1.insert data in database");
                System.out.println("2.update data in database");
                System.out.println("3.Delete data in database");
                System.out.println("4.Show data");
                System.out.println("5.All clause");
                System.out.println("6.join clause");
                System.out.println("7.InExist");
                System.out.println("8.Aggregate Function.");
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your choice.");
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        insert(conn);
                        break;

                    case 2:
                        update(conn);
                        break;

                    case 3:
                        delete(conn);
                        break;

                    case 4:
                        show(conn);
                        break;
                    case 5:
                      allClause(conn);
                        break;
                    case 6:
                        join(conn);
                        break;

                    case 7:
                       in_Exists(conn);
                        break;

                    case 8:
                       aggregateFunction(conn);
                        break;
                }

            } while (ch != 0);

        } catch (Exception e) {
            System.out.println("Some error occurred.");
            e.printStackTrace();
        }

    }
}
