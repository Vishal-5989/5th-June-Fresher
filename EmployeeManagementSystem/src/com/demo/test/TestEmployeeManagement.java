
package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImplementation;

public class TestEmployeeManagement {

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        EmployeeService eService=new EmployeeServiceImplementation();
        int choice;

        do {
            System.out.println("\n*****|| Employee Management System ||*****");
            System.out.println("1. Create New Employee");
            System.out.println("2. Find Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Sort Employee");
            System.out.println("5. Display All Employee");
            System.out.println("6. Modify Employee");
            System.out.println("7. EXIT");
            System.out.println("Enter Choice:");
            choice=scan.nextInt();
            switch(choice) {
                case 1:
                    boolean status=eService.createEmployee();
                    if(status) {
                        System.out.println("Employee Added Successfully...");
                    }
                    else
                    {
                        System.out.println("Employee with same ID is already exists...");
                    }
                    break;
                case 2:
                    System.out.println("Find Employee");
                    int ch1;
                    do{
                        System.out.println("1. Find Employee By Id:");
                        System.out.println("2. Find Employee By Name:  ");
                        System.out.println("3. Find By Salary > given Salary");
                        System.out.println("4. Return");
                        System.out.println("Enter Choice: ");
                        ch1=scan.nextInt();
                        switch(ch1) {
                            case 1:
                                System.out.print("Enter Id to Search: ");
                                int id =scan.nextInt();
                                Employee e=eService.findById(id);
                                if(e!=null) {
                                    System.out.println(e);
                                }
                                else
                                {
                                    System.out.println("Not Found...");
                                }
                                break;
                            case 2:
                                System.out.print("Enter Name to Search: ");
                                String name=scan.next();
                                List<Employee> emplist=eService.findByName(name);
                                if(emplist!=null)
                                {
                                    emplist.stream().forEach(x->{System.out.println(x);});
                                }
                                else
                                {
                                    System.out.println("Not Found...");
                                }
                                break;
                            case 3:
                                System.out.println("Enter Minimum Salary Limit: ");
                                double salary=scan.nextDouble();
                                List<Employee> empList1=eService.findBySalary(salary);
                                if(empList1!=null) {
                                    empList1.stream().forEach(x->{System.out.println(x);});
                                }
                                else {
                                    System.out.println("Not Found...");
                                }
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Invalid Choice...");
                                break;
                        }
                    }while(ch1!=4);
                    break;
                case 3:
                    System.out.println("Remove Employee");
                    int ch2;
                    do{
                        System.out.println("1. Remove Employee By Id:");
                        System.out.println("2. Remove Employee By Name:  ");
                        System.out.println("3. Return");
                        System.out.println("Enter Choice: ");
                        ch2=scan.nextInt();
                        switch(ch2) {
                            case 1:
                                System.out.print("Enter ID you want to remove: ");
                                int id=scan.nextInt();
                                int stat=eService.removeById(id);
                                if(stat==-1) {
                                    System.out.println("\nID Found & Removed Successfully\n");
                                }
                                else if(stat==-2) {
                                    System.out.println("\nID found but not Removed\n");
                                }
                                else
                                {
                                    System.out.println("\nID Not Found\n");
                                }
                                break;
                            case 2:
                                System.out.println("Enter the name you want to remove: ");
                                String name=scan.next();
                                stat=eService.removeByName(name);
                                if(stat==-1) {
                                    System.out.println("\nName Found & Removed Successfully\n");
                                }
                                else if(stat==-2) {
                                    System.out.println("\nName found but not Removed\n");
                                }
                                else
                                {
                                    System.out.println("\nName Not Found\n");
                                }
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Invalid Choice...");
                                break;
                        }
                    }while(ch2!=3);
                    break;
                case 4:
                    System.out.println("Sort Employee");
                    int ch3;
                    do{
//				System.out.println("1. Find Employee By Id:");
//				System.out.println("2. Find Employee By Name:  ");
                        System.out.println("1. Sort Employee By Salary");
                        System.out.println("2. Return");
                        System.out.println("Enter Choice: ");
                        ch3=scan.nextInt();
                        switch(ch3) {
                            case 1:
                                Set<Employee> eSet = eService.sortBySalary();
                                for(Employee emp:eSet) {
                                    System.out.println(emp);
                                }
                                break;
                            case 2:
                                break;
                            default:
                                System.out.println("Invalid Choice...");
                                break;
                        }
                    }while(ch3!=2);
                    break;
                case 5:
//			System.out.println("Display All");
                    Set<Employee> eset=eService.displayAll();
                    if(eset!=null) {
                        eset.stream().forEach(x->{System.out.println(x);});
                    }
                    else {
                        System.out.println("Not Found");
                    }
                    break;
                case 6:
                    System.out.println("Modify Employee");
                    int ch5;
                    do{
                        System.out.println("1. Modify Employee Salary");
                        System.out.println("2. Return");
                        System.out.println("Enter Choice: ");
                        ch5=scan.nextInt();
                        switch(ch5) {
                            case 1:
                                System.out.println("Enter ID: ");
                                int id=scan.nextInt();
//					System.out.println("Enter New Salary");
//					double newsal=scan.nextDouble();
                                //int stat=eService.modifySalary(id,newsal);
                                int stat=eService.modifySalary(id);
                                if(stat==-1) {
                                    System.out.println("Employee With given ID found & Modified Successfully");
                                }
                                else if(stat==-2) {
                                    System.out.println("Employee with given ID found But not modified");
                                }
                                else {
                                    System.out.println("Employee with given ID didn't found");
                                }
                                break;
                            case 2:
                                break;
                            default:
                                System.out.println("Invalid Choice...");
                                break;
                        }
                    }while(ch5!=2);
                    break;
                case 7:
                    System.out.println("THANK YOU...!!!");
                    scan.close();
                    break;
                default:
                    System.out.println("INVALID CHOICE....");
                    break;
            }
        }while(choice!=7);
    }
}
