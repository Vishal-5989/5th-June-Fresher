package org.example;
import com.opencsv.CSVReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.Scanner;
public class FileHandling {

    public static void readFile(){

        try {
            FileReader filereader = new FileReader("C:\\Users\\NTS-Akshay Bokhare\\Desktop\\test_2.csv");
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;

            while ((nextRecord = csvReader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.printf("%-10s" ,cell);
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void writeFile(){
        try {

            File file = new File("C:\\Users\\NTS-Akshay Bokhare\\Desktop\\test_2.csv");
            FileWriter outputfile = new FileWriter(file);

            CSVWriter writer = new CSVWriter(outputfile);

            String[] header = {"EMP", "DEP", "AGE "};
            writer.writeNext(header);
            String[] data1 = {"Vishal", "App", "22"};
            writer.writeNext(data1);
            String[] data2 = {"Devarsh", "QA", "23"};
            writer.writeNext(data2);
            String[] data3 = {"Dipak", "Tester", "30"};
            writer.writeNext(data3);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("File Write Sucessfully");
    }
    public static void readJsonFile() throws IOException, ParseException {

        JSONParser js = new JSONParser();

        FileReader reader = new FileReader("C:\\Users\\NTS-Akshay Bokhare\\Desktop\\test_1.json");

        Object obj =js.parse(reader);

        JSONObject jobj = (JSONObject) obj;

        String fname = (String)  jobj.get("FirstName");
        String lname = (String)  jobj.get("LastName");
        System.out.println(fname);
        System.out.println(lname);
    }
    public static void main(String[] args) throws IOException, ParseException {

        System.out.println("** Press 1 For Read Csv/Xl File **");
        System.out.println("** Press 2 For write Csv/Xl File **");
        System.out.println("** Press 3 For Read JSON File **");
        Scanner sc = new Scanner(System.in);
        int input=sc.nextInt();
        switch (input){
            case 1:
                FileHandling.readFile();
                break;
            case 2:
                FileHandling.writeFile();
                break;
            case 3:
                FileHandling.readJsonFile();
                break;
            default:
                System.out.println("wrong Input");
        }
    }
}

