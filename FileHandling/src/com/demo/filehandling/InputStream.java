package com.demo.filehandling;

import java.io.*;
import java.util.Scanner;

public class InputStream {


    public static void readFile(){
        try {
            FileInputStream fin= new FileInputStream("C:\\Users\\NTS-Akshay Bokhare\\Desktop\\test.txt");
            Scanner sc = new Scanner(fin);
           if (sc.hasNext()){
               System.out.println(sc.nextLine());
           }
        } catch (Exception e) {
            System.out.println("Txt File Not Found");
        }
    }
    public static void writeFile(){
        try {
            FileWriter fw = new FileWriter("C:\\Users\\NTS-Akshay Bokhare\\Desktop\\test.txt");
            fw.write(" This is new File Affter write New Data");

                fw.close();
            System.out.println("File Write Sucessfull");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void deleteFile(){
        try {

           File fobj =new File("C:\\Users\\NTS-Akshay Bokhare\\Desktop\\test.txt");
            System.out.println(fobj.delete() +" File Delete SuccesFully ");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void createFile(){
        try {

            File obj = new File("test.txt");
            obj.createNewFile();

            System.out.println("File Create Succsefull");


        } catch (Exception e) {
            System.out.println(e);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("** press 1 for readFile  **");
        System.out.println("** press 2 for writeFile  **");
        System.out.println("** press 3 for deleteFile  **");
        System.out.println("** press 4 for createFile  **");

        int input =sc.nextInt();
        switch (input){
            case 1:
                InputStream.readFile();
                break;
            case 2:
                InputStream.writeFile();
                break;
            case 3:
                InputStream.deleteFile();
                break;
            case 4:
                InputStream.createFile();
                break;
        }


    }
}
