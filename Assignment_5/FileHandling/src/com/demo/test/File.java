package com.demo.test;

import java.util.Scanner;

public class File {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        Solution s=new Solution();
        do {
            System.out.println("*************MENU****************\n");
            System.out.println(" 1.writing the data in the file file.txt using Java FileWriter class. \n " +
                    "2.Reading the data from the text file file.txt using Java FileReader class. \n 3.Exit ");
            System.out.println("Enter Your Choice!!!");
            choice= sc.nextInt();

            switch (choice){
                case 1: {
                    s.fileWriter();
                }
                break;
                case 2:{
                    s.fileReader();
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
