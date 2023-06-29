package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner sc=new Scanner(System.in);
        int choice=0;
        Solution s=new Solution();
        do {
            System.out.println("*************MENU****************\n");
            System.out.println(" 1.writing the data in the CSV file file.csv \n " +
                    "2.Reading the data from the csv file  \n 3.writing the data in the JSON file in file.json \n " +
                    "4.Reading the data in the JSON file in file.json \n 6.Exit ");
            System.out.println("Enter Your Choice!!!");
            choice= sc.nextInt();

            switch (choice){
                case 1: {
                    s.writeData();
                }
                break;
                case 2:{
                    s.readData();
                }
                break;
                case 3:{
                    s.writejson();
                }
                break;
                case 4:{
                    s.readJson();
                }
                break;

                case 5:
                    System.out.println("Thank You For Visiting !!!!");
                    break;

                default:
                    System.out.println("You Have Enter Wroung Choice!!");

            }
        }while (choice!=5);
    }
}

