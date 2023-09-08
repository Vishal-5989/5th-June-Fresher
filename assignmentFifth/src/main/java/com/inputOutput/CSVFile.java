package com.inputOutput;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVFile {
    public void input(){

        try {
            File file = new File("C:\\Assignment\\EmployeeData.csv");
            FileWriter outputfile = new FileWriter(file);

            CSVWriter writer = new CSVWriter(outputfile);

            String[] header = { "Name", "Class", "Marks" };
            writer.writeNext(header);

            String[] data1 = { "Vishal", "1", "620" };
            writer.writeNext(data1);

            String[] data2 = { "Devarsh", "1", "630" };
            writer.writeNext(data2);
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void output(){
        try {

            FileReader filereader = new FileReader("C:\\Assignment\\EmployeeData.csv");
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;

            while ((nextRecord = csvReader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
