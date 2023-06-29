package abc.jdbc;
import abc.crud.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc {
    public static void main(String[] args)
    {
        int choice;
         try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/neutrino", "root", "root");
                System.out.println("Connection is done");

                Scanner c = new Scanner(System.in);
                Crud ca = new Crud();
                do {
                System.out.println("0.Exist\n1.Insert Employee Details\n2.Update Employee Details\n3.Delete Employee Details\n4.Show Student Details\n" +
                        "5.Get Employee details by Id \n6.joins\n7.groupBy\n8.Operator");
                System.out.println("Enter Your Choice from above");
                choice = c.nextInt();

                switch (choice) {
                    case 1:
                        ca.insert(con);
                        break;

                    case 2:
                        ca.update(con);
                        break;
                    case 3:
                        ca.delete(con);
                        break;
                    case 4:
                        ca.readTable(con);
                        break;
                    case 5:
                        ca.getById(con);
                        break;
                    case 6:
                        ca.join(con);
                        break;

                    case 7:
                        ca.groupBy(con);
                        break;
                    case 8:
                        ca.clauses(con);
                        break;

                    default:
                        System.out.println("Enter Valid Choice !!");

                }
            } while(choice !=0);

            } catch (Exception e) {
                e.printStackTrace();
        }

    }
}
