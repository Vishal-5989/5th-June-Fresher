
                        //** JDBC with Statement **//
package org.example;
import java.sql.*;
import java.util.Scanner;

public class CrudOperation {
    public static void insertData() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");

          Statement statement = connection.createStatement();

          String sqlQuery =  "INSERT INTO emp VALUES (1,'Vishal', 'Bokhare', 'Pune')";

          statement.execute(sqlQuery);

            System.out.println("Record Insert Successfully");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void updateData(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");

            Statement statement = connection.createStatement();

            String sqlQuery =
                    "UPDATE emp SET FirstName = 'Mark', EmpCity = 'US' WHERE Id = 1;" ;

            statement.execute(sqlQuery);

            System.out.println("Record UPDATE Sucsessfully");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void getData() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");

            Statement statement = connection.createStatement();

            String sqlQuery =  "SELECT FirstName,LastName FROM emp;";

                      ResultSet resultSet =statement.executeQuery(sqlQuery);

                      while (resultSet.next()){

                         String firstName =resultSet.getString("FirstName");
                          String lastName =resultSet.getString("LastName");

                          System.out.println(firstName +" " +lastName);

                      }
            System.out.println("Record Fetch Sucsessfully");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteUser() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");

            Statement statement = connection.createStatement();

            String sqlQuery ="DELETE FROM emp WHERE Id=2 ";

            statement.execute(sqlQuery);
            System.out.println("Employee Delete Sucsessfully");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("** Java To MySQL Connectivity (JDBC) Statement **");
        System.out.println("** Press 1 for insertData()   **");
        System.out.println("** Press 2 for updateData()   **");
        System.out.println("** Press 3 for getData()      **");
        System.out.println("** Press 4 for deleteUser()   **");
        int input =sc.nextInt();

        switch (input){
            case 1:
                CrudOperation.insertData();
                break;
            case 2:
                CrudOperation.updateData();
                break;
            case 3:
                CrudOperation.getData();
                break;
            case 4:
                CrudOperation.deleteUser();
                break;
            default:
                System.out.println("Wrong Input");

        }
    }
}