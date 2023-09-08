package com.jdbc;

import com.crudImpl.Crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc", "root",
                    "root");
            Crud c = new Crud();
            System.out.println("================================================");
            System.out.println("(1) Creating an employee");
            System.out.println("(2) Reading an employee");
            System.out.println("(3) Updating an employee");
            System.out.println("(4) Deleting an employee");
            System.out.println("(5) Grouping an employee by department");
            System.out.println("(6) Get data in ascending order by its firstname");
            System.out.println("(7) Like query");
            System.out.println("================================================");
            System.out.println("Enter your choice:");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    c.create(con);
                    break;
                case 2:
                    c.read(con);
                    break;
                case 3:
                    c.update(con);
                    break;
                case 4:
                    c.delete(con);
                    break;
                case 5:
                    c.groupBy(con);
                    break;
                case 6:
                    c.orderBy(con);
                    break;
                case 7:
                    c.like(con);
                    break;
                default:
                    System.out.println("Please enter valid choice");
                    break;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
