package com.demo.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadCsv {
    public static void main(String[] args) {
        String file ="C:\\Users\\NTS-Akshay Bokhare\\Desktop\\test.csv";
        BufferedReader reader = null;
        String line="";
        try{
            reader=new BufferedReader(new FileReader(file));
            while ((line=reader.readLine())!=null){

                String row[]=line.split(",");
                for (String index:row){
                    System.out.printf("%-10s" ,index);
                }
                System.out.println();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
