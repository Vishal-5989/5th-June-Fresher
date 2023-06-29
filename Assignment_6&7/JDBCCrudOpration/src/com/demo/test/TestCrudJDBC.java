package com.demo.test;

import com.demo.beans.Department;
import com.demo.service.DeptService;
import com.demo.service.DeptServiceImpl;

import java.util.List;
import java.util.Scanner;

public class TestCrudJDBC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DeptService dService=new DeptServiceImpl();
        int choice=0;
        do{
            System.out.println(" 1. Add new department \n 2. Delete the department \n " +
                    "3. Find the department \n 4. Display All \n 5. Update the department on deptno \n " +
                    "6. Group By Clause \n 7. Order By Clause \n 8. Having Clause \n " +
                    "9. Joins \n 10. Exit");
            System.out.println("Enter the choice....");
            choice= sc.nextInt();
            switch (choice){
                case 1:
                    dService.addNewDepartment();
                    break;
                case 2: {
                    System.out.println("Enter the department no. ");
                    int deptno = sc.nextInt();
                    boolean status = dService.deleteByDeptno(deptno);
                    if (status) {
                        System.out.println("Deleted department in database successfully... ");
                    } else {
                        System.out.println("Not found the department no. ");
                    }
                }
                    break;
                case 3: {
                    System.out.println("Enter the department no. ");
                    int deptno = sc.nextInt();
                    Department d = dService.findByDeptno(deptno);
                    if(d!=null){
                        System.out.println(d);
                    }else{
                        System.out.println("Not Found.. ");
                    }

                }
                    break;
                case 4:
                    List<Department>dlist=dService.getAll();
                    if(dlist!=null){
                        dlist.stream().forEach(System.out::println);
                    }else{
                        System.out.println("Table is empty...");
                    }
                    break;
                case 5: {
                    System.out.println("Enter the department no. ");
                    int deptno= sc.nextInt();
                    Department d=dService.findByDeptno(deptno);
                    if(d!=null){
                        System.out.println("Enter the department name. ");
                        String dname= sc.next();
                        System.out.println("Enter the location. ");
                        String loc= sc.next();
                        System.out.println("Enter the password. ");
                        String pwd= sc.next();
                        System.out.println("Enter the started date. ");
                        String startedon= sc.next();
                        boolean status=dService.modifyByDeptno(deptno,dname,loc,pwd,startedon);
                        if(status){
                            System.out.println("Updated Successfully");
                        }
                        else
                        {
                            System.out.println("Department no. is Not Found in database please provide valid department no. ");

                        }
                    }else{
                        System.out.println("Department no. is Not Found in database please provide valid department no. ");
                    }
                }
                    break;


                case 6:{
                    dService.groupByClause();
                }

                    break;
                case 7:{
                    dService.orderByClause();
                }

                break;
                case 8:{
                    System.out.println("Display the Employee where employee > than 1");
                    dService.havingClause();
                }
                break;

                case 9:{
                    System.out.println("Enter the choice");
                    int ch1;
                    do{
                        System.out.println("1. Example of cross join or product join ");
                        System.out.println("2. Example of Self join ");
                        System.out.println("3. Example of inner join ");
                        System.out.println("4. Return");
                        System.out.println("Enter Choice: ");
                        ch1=sc.nextInt();
                        switch(ch1) {
                            case 1:
                                dService.crossJoin();
                                break;
                            case 2:
                                dService.selfjoin();
                                break;
                            case 3:
                                dService.innerJoin();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Invalid Choice...");
                                break;
                        }
                    }while(ch1!=4);


                }
                break;
                case 10:
                    System.out.println("Thank You.....");
                    dService.closeMyConnection();

                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        }while(choice!=10);
    }

}
