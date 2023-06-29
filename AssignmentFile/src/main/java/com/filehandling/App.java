package com.filehandling;


import java.util.Scanner;
import com.inputoutput.CSVTest1;

import com.inputoutput.JsonReadWrite;
import com.inputoutput.TextFileTest1;



public class App 
{
    public static void main( String[] args )
    {

        System.out.println( " Enter Your Choice " );
        int choice;
        Scanner sc=new Scanner(System.in);
        choice=sc.nextInt();
        switch(choice){
            case 1:
                CSVTest1 csv = new CSVTest1();
                csv.input();
               csv.output();
                break;
            case 2:
                TextFileTest1 textfile = new TextFileTest1();
                textfile.input();
                textfile.output();
                break;




            default:
                System.out.println("Invalid choice");
                break;
        }


    }
}

