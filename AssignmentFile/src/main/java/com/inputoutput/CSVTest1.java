package com.inputoutput;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVTest1 {

    public void input(){
        try{

            File file=new File("C:\\Assignments27\\data.csv");
            FileWriter outputfile=new FileWriter(file);
            CSVWriter writer=new CSVWriter(outputfile);

            String[] colName={"Name","Profession"};
            writer.writeNext(colName);
            String[] data1={"Disha","Painter"};
            writer.writeNext(data1);
            String[] data2={"Jyoti","Teacher"};
            writer.writeNext(data2);
            writer.close();



        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
    public void output(){
        try{
            FileReader filereader=new FileReader("C:\\Assignments27\\data.csv");
            CSVReader csvReader=new CSVReader(filereader);
            String[] nextRecord;

            while((nextRecord = csvReader.readNext()) != null){
                for(String s: nextRecord){
                    System.out.print(s +"\t\t");
                }
                System.out.println();
            }


        }
        catch (Exception ae){
            ae.printStackTrace();
        }
    }
}
