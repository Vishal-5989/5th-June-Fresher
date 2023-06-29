package com.demo.test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=0;

        do {
            System.out.println("*************MENU****************\n");
            System.out.println(" 1.Area of Circle \n 2.Perimeter of Circle \n 5.Exit ");
            System.out.println("Enter Your Choice!!!");
            choice= sc.nextInt();
            Function f=new Function();
            switch (choice){
                case 1: {
                    System.out.println("Enter the radius of circle");
                    int r=sc.nextInt();
                    f.circleArea(r);
                }
                break;
                case 2:{
                    System.out.println("Enter the radius of circle");
                    int r= sc.nextInt();
                    f.circleCircum(r);
                }
                break;
                case 3:
                    System.out.println("Thank You For Visiting !!!!");
                    break;

                default:
                    System.out.println("You Have Enter Wroung Choice!!");

            }
        }while (choice!=3);
    }

}
