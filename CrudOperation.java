package SQL;

import java.sql.*;
import java.util.Scanner;

public class CrudOperation
{
    public static void insertdata()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jaydb","root","Ross@0909");
            Statement stmt = connection.createStatement();
            String sqlquery = "INSERT into employee VALUES(404,'Rohan Phaphale',23,'Pune')";

                    stmt.execute(sqlquery);
                    System.out.println("Record Inserted Successfully");


        } catch ( ClassNotFoundException |SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    public  static void updatedata()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jaydb", "root", "Ross@0909");
            Statement stmt = connection.createStatement();
            String sqlquery = "update employee SET name='Pranesh Bafna', city ='Delhi' WHERE id =402  ";
            stmt.execute(sqlquery);
            System.out.println("Record Updates Successfully in the table");


        } catch (ClassNotFoundException | SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
    public static void delete()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jaydb","root","Ross@0909");
            Statement stmt = connection.createStatement();
            String sql = " Delete from employee WHERE id =403";
            stmt.execute(sql);
            System.out.println("Record Successfully Deleted");
        } catch (ClassNotFoundException | SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void getdata()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jaydb","root","Ross@0909");
            Statement stmt = connection.createStatement();
            //String sql =" Select id,Name,city,age from employee";
            String sql1 = "Select Name from employee";
            //ResultSet resultSet =stmt.executeQuery(sql);
            ResultSet resultSet1 =stmt.executeQuery(sql1);
            while(resultSet1.next())
            {
                //String id = resultSet.getString("id");
                String name = resultSet1.getString("name");
                //String city = resultSet.getString("city");
                //String age = resultSet.getString("age");

                //System.out.println(id+" "+name+"     "+city+" "+age+" ");
                System.out.println(name);
            }
            System.out.println();
            System.out.println();
            System.out.println("SuccessFully Fetched Data");
        } catch (ClassNotFoundException | SQLException e)
        {
            throw new RuntimeException(e);
        }
    }



    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("CRUD Operations using JDBC Connectivity");
        System.out.println("Press 1 to InsertData");
        System.out.println("Press 2 to UpdateData");
        System.out.println("Press 3 to Delete Data");
        System.out.println("Press 4 to Fetch Data");
        int input = sc.nextInt();

        switch (input)
        {
            case 1:
                CrudOperation.insertdata();
                break;
            case 2:
                CrudOperation.updatedata();
                break;
            case 3:
                CrudOperation.delete();
                break;
            case 4:
                CrudOperation.getdata();
                break;
            default:
                System.out.println("Incorrect Option Choosen");


        }
    }

}


