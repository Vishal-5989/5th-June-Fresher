package com.inputoutput;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;



import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVTest {


    public void input() {
        try {

            File file = new File("C:\\Users\\NTS-Jyoti Daundkar\\Desktop\\New XLS Worksheet.csv");
            FileWriter outfile=new FileWriter(file);
            CSVWriter writer=new CSVWriter(outfile);


            String[] colName = {"Name", "Profession"};
            writer.writeNext(colName);
            String[] data1 = {"Jyoti", "Teacher"};
            writer.writeNext(data1);
            String[] data2 = {"Disha", "Painter"};
            writer.writeNext(data2);
            writer.close();


        }
        catch (IOException e){
            e.printStackTrace();
        }


    }


        public void output()  {
            try {


                FileReader fileReader = new FileReader("C:\\Users\\NTS-Jyoti Daundkar\\Desktop\\New XLS Worksheet.csv");
                CSVReader csvReader = new CSVReader(fileReader);
                String[] nextRecord;

                while ((nextRecord = csvReader.readNextSilently()) != null) {
                    for (String s : nextRecord) {
                        System.out.println(s + "\t\t");
                    }
                    System.out.println();
                }

            }  catch(IOException ae){
                    ae.printStackTrace();
                }

        }
    }


