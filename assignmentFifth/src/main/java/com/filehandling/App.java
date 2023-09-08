package com.filehandling;

import com.inputOutput.CSVFile;
import com.inputOutput.Json;
import com.inputOutput.TxtFile;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("(1) For reading and writing in txt file");
        System.out.println("(2) For reading and writing in CSV file");
        System.out.println("(3) For reading and writing in JSON file");
        System.out.println("Enter your choice:");
        int choice;
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice){
            case 1:
                TxtFile inputOutput = new TxtFile();
//                inputOutput.input();
//                inputOutput.output();
                break;
            case 2:
                CSVFile excel = new CSVFile();
//                excel.input();
                excel.output();
                break;
            case 3:
                Json json = new Json();
                json.input();
                json.output();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
