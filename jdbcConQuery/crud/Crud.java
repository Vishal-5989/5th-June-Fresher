package abc.crud;

import org.w3c.dom.ls.LSOutput;

import java.sql.*;
import java.util.Scanner;
import java.util.Stack;

public class Crud {
    Scanner c = new Scanner(System.in);
    public void insert(Connection con) {

        try {
            String sql = "INSERT INTO employee (empid,name,dept) VALUES (?,?,?)";
            Scanner c = new Scanner(System.in);
            System.out.println("Enter empid of employee");
            int empid = c.nextInt();
            System.out.println("Enter name of employee");
            String name = c.next();
            System.out.println("Enter department of employee");
            String dept = c.next();



            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, empid);
            stmt.setString(2, name);
            stmt.setString(3, dept);


            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void delete(Connection con) {
        try {
            String q = "delete from employee where empid=?";
            System.out.println("Enter id you want to delete");
            int id = c.nextInt();
            PreparedStatement pt = con.prepareStatement(q);
            pt.setInt(1,id);
            int i = pt.executeUpdate();
            System.out.println(i+"\t"+"record is deleted");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void getById(Connection con) {
        try {
            String s = "select empid,name,dept from employee where empid =?";
            System.out.println("Enter empid you want to see employee details");

            int id = c.nextInt();
            if (id < 0) {
                System.out.println("Enter valid Id");
            }
            PreparedStatement st = con.prepareStatement(s);
            st.setInt(1,id);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                int i = rs.getInt("empid");
                System.out.println("empid"+"\t"+"name"+"\t"+"dept");
                System.out.println(rs.getInt("empid")+ "\t" + rs.getString("name")+"\t"+rs.getString("dept"));
            }
        }
        catch(Exception e )
        {
            e.printStackTrace();
        }
    }
    public void readTable(Connection con) {
        try {
            String s = "select empid,name,dept,salary from employee";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(s);
            while (rs.next()) {
                System.out.println(rs.getInt("empid") + "\t " + rs.getString("name") + "\t" + rs.getString("dept")+"\t"+rs.getString("salary"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(Connection con) {

        try{
            System.out.println("What you want to update ?");
            System.out.println("1.name\n2.dept");
            int choice = c.nextInt();

            switch(choice)
            {
                case 1:
                    String s= "Update employee set name=? where empid=?";
                    System.out.println("Enter empid");
                    int id  = c.nextInt();
                    System.out.println("Enter name you want to change");
                    String name = c.next();

                    PreparedStatement pst = con.prepareStatement(s);
                    pst.setInt(2,id);
                    pst.setString(1,name);

                    pst.executeUpdate();
                    System.out.println("Name is updated ..");

                      System.out.println("Employee is updated..");
                    break;

                    case 2:
                        String sq= "Update employee set dept=? where empid=?";
                        System.out.println("Enter empid");
                        int i  = c.nextInt();
                        System.out.println("Enter dept you want to change");
                        String dept = c.next();
                        PreparedStatement st = con.prepareStatement(sq);
                        st.setInt(2,i);
                        st.setString(1,dept);
                        st.executeUpdate();
                        System.out.println("Employee is updated..");
                        break;
            }
        }
        catch(Exception e )
        {
            e.printStackTrace();
        }
    }
    public void join(Connection con) {
        try {
            String s = "SELECT employee.empid as id,employee.name as name, department.dept FROM employee LEFT JOIN department ON employee.dept = department.dept;";
            PreparedStatement pt = con.prepareStatement(s);
           ResultSet rs =  pt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+ rs.getString("dept"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void groupBy(Connection con) {
        try {
           // Statement st=con.createStatement();
            String s = "Select  count(empid) as employeeId ,name from employee group by name";
            PreparedStatement pt = con.prepareStatement(s);
             ResultSet re = pt.executeQuery(s);
            System.out.println("==========Group by ===========");
             while(re.next())
             {

            System.out.println(re.getInt("employeeId")+"\t"+re.getString("name"));

             }
            System.out.println("========================");
        }
        catch(Exception e)
        {
          e.printStackTrace();
        }
    }

    public void clauses(Connection con) {
        System.out.println("1.In \n2.Not In\n3.Min\n4.Max");
        System.out.println("Enter valid choice");
        int choice;

            choice = c.nextInt();
            switch (choice) {
                case 1:
                    try {
                        String q = "SELECT name,dept FROM employee WHERE dept IN ('QA', 'Product')";
                        PreparedStatement pt = con.prepareStatement(q);
                        ResultSet result = pt.executeQuery();
                        System.out.println("=============In operator===================");
                        while (result.next()) {
                            System.out.println(result.getString("name") + "\t" + result.getString("dept"));
                        }
                        System.out.println("================================");
                    }catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    try {
                        String query = "SELECT name,dept FROM employee WHERE dept Not IN ('QA', 'Product')";
                        PreparedStatement pt = con.prepareStatement(query);
                        ResultSet res = pt.executeQuery();
                        System.out.println("===========Not In operator=====================");
                        while(res.next())
                        {
                            System.out.println(res.getString("name")+"\t"+res.getString("dept"));
                        }
                        System.out.println("================================");

                    } catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    try {
                        String qu = "select MIN(salary) AS empsalary FROM employee  ;";
                        PreparedStatement pt = con.prepareStatement(qu);
                        ResultSet ret = pt.executeQuery();
                        System.out.println("==============Min salary==================");
                        while(ret.next())
                        {
                            System.out.println(ret.getString("name")+"\t"+ret.getString("empsalary"));
                        }
                        System.out.println("================================");
                    } catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    try {
                        String s = "select Max(salary) AS empsalary FROM employee;";
                        PreparedStatement pt = con.prepareStatement(s);
                        ResultSet rt = pt.executeQuery();
                        System.out.println("=============Max Salary===================");
                        while(rt.next())
                        {
                            System.out.println(rt.getString("empsalary"));
                        }
                        System.out.println("================================");

                    } catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                    break;

                default:
                    System.out.println("Enetr valid choice ");
            }
    }
}
