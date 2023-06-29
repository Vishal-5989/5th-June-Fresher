
                                            //** JDBC with PrepareStatement **//
package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CrudOperation_2 {

    public static void insertData(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student ID");
        int id = sc.nextInt();
        System.out.println("Enter Student Name");
        String name = sc.next();
        System.out.println("Enter Sudent Department");
        String Department = sc.next();
        System.out.println("Enter Student City");
        String city =sc.next();
        try {
            Connection connection = CommonConnection.getConnection();
            PreparedStatement ps  =connection.prepareStatement("insert into student(stdId,stdName,stdDepa,stdCity) values (?,?,?,?)");

            ps.setInt   (1,id);
            ps.setString(2,name);
            ps.setString(3,Department);
            ps.setString(4,city);

            ps.execute();

            System.out.println("Record Insert in DataBase Successfully");
        }
       catch (Exception e){
           System.out.println(e.getMessage());
       }
    }

    public static void getData_1(){

              Connection connection =CommonConnection.getConnection();
              Scanner sc = new Scanner(System.in);
               System.out.println("Enter Student Id");
              int id =sc.nextInt();

        try {
            PreparedStatement ps = connection.prepareStatement("select stdId,stdName,stdDepa,stdCity from student where stdId="+id);

                   ResultSet rs =ps.executeQuery();

                     while (rs.next()){
                    int id1=rs.getInt("stdId");
                    String name=rs.getString("stdName");
                    String depa=rs.getString("stdDepa");
                    String city=rs.getString("stdCity");

                    System.out.println("Student ID = "+id1);
                    System.out.println("Student Name = "+name);
                    System.out.println("Student Department = "+depa);
                    System.out.println("Student City = "+city);
                }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void groupBy(){

        Connection connection =CommonConnection.getConnection();

        try {
            PreparedStatement ps =connection.prepareStatement("SELECT stdId,stdName,stdDepa FROM student GROUP BY stdId,stdName,stdDepa;");
            ResultSet rs =ps.executeQuery();
            while (rs.next()){
               int id = rs.getInt("stdId");
               String name=rs.getString("stdName");
               String depa=rs.getString("stdDepa");

                System.out.println("Student ID = "+id);
                System.out.println("Student Name = "+name);
                System.out.println("Student Department = "+depa);

                System.out.println(" ");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void orderdBy(){
        Connection connection =CommonConnection.getConnection();
        try {
            PreparedStatement ps =connection.prepareStatement("SELECT stdName, stdDepa,Marks FROM student ORDER BY Marks ASC;");

                ResultSet rs =ps.executeQuery();

            System.out.println("-- Display Student Marks Ascending order --");

                while (rs.next()){

                   String name= rs.getString("stdName");
                   String depa = rs.getString("stdDepa");
                   int marks = rs.getInt("Marks");

                    System.out.println("Student Name = "+name);
                    System.out.println("Student Department = "+depa);
                    System.out.println("Student Marks = "+marks);
                    System.out.println(" ");

                }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void orderdBy_1(){
        Connection connection =CommonConnection.getConnection();
        try {
            PreparedStatement ps =connection.prepareStatement("SELECT stdName, stdDepa,Marks FROM student ORDER BY Marks DESC;");

            ResultSet rs =ps.executeQuery();

            System.out.println("-- Display Student Marks Descending Order --");

            while (rs.next()){

                String name= rs.getString("stdName");
                String depa = rs.getString("stdDepa");
                int marks = rs.getInt("Marks");

                System.out.println("Student Name = "+name);
                System.out.println("Student Department = "+depa);
                System.out.println("Student Marks = "+marks);
                System.out.println(" ");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void findRecord(){

                Connection connection =CommonConnection.getConnection();
                Scanner sc = new Scanner(System.in);
                    System.out.println(" Search Student by Using Student Name ");
                    String name =sc.next();
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM student WHERE stdName LIKE '%"+name+"'" );
            ResultSet rs =ps.executeQuery();
            while (rs.next()){

                int id1=rs.getInt("stdId");
                String name1=rs.getString("stdName");
                String depa=rs.getString("stdDepa");
                String city=rs.getString("stdCity");

                System.out.println("Student ID = "+id1);
                System.out.println("Student Name = "+name1);
                System.out.println("Student Department = "+depa);
                System.out.println("Student City = "+city);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("** Java To MySQL Connectivity (JDBC) PrepareStatement **");
        System.out.println("** Press 1 for insertData()   **");
        System.out.println("** Press 2 for getData()   **");
        System.out.println("** Press 3 for groupBy()   **");
        System.out.println("** Press 4 for orderdBy()   #Ascending Order   **");
        System.out.println("** Press 5 for orderdBy_1() #Descending Order   **");
        System.out.println("** Press 6 for findRecord() #LIKE Operator  **");

        int input =sc.nextInt();

        switch (input){
            case 1:
                CrudOperation_2.insertData();
                break;
            case 2:
                CrudOperation_2.getData_1();
                break;
            case 3:
                CrudOperation_2.groupBy();
                break;
            case 4:
                CrudOperation_2.orderdBy();
                break;
            case 5:
                CrudOperation_2.orderdBy_1();
                break;
            case 6:
                CrudOperation_2.findRecord();
                break;
            default:
                System.out.println("Wrong Input");

        }
    }
    }

