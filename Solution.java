package org.example;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import netscape.javascript.JSObject;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.*;

public class Solution {
    //write data
    public  void writeData(){
        try{
            File fi = new File("C:\\Users\\NTS-Bhushan Dere\\IdeaProjects\\CsvF2\\Df\\data.csv");

            FileWriter outputfile = new FileWriter(fi);
            CSVWriter writer = new CSVWriter(outputfile);

            List<String[]> data = new ArrayList<String[]>();
            data.add(new String[] {"Name","Class","Marks"});
            data.add(new String[] {"A","12","400"});
            data.add(new String[] {"S","12","500"});
            writer.writeAll(data);
            System.out.println("Writing Csv data Successfull");

            writer.close();

        }catch (Exception e)
        {
            System.out.println("Something is wrong");
            System.out.println(e.getMessage());
        }

    }

    public void readData(){
        try{
            CSVReader reader = new CSVReader(new FileReader("C:\\Users\\NTS-Bhushan Dere\\IdeaProjects\\CsvF2\\Df\\data.csv"));
            StringBuffer buffer = new StringBuffer();
            String line[];
            while ((line=reader.readNext()) != null){
                for (int i=0;i<line.length;i++){
                    System.out.println(line[i]+"    ");
                }
                System.out.println("  ");
            }
            System.out.println("Reading the csv file is successful");
        }catch(Exception e){
            System.out.println("Something is wrong");
        }
    }

    public void writejson(){
        try{
            JSONObject js = new JSONObject();
            js.put("ID","N0398");
            js.put("Name","Shubham");
            js.put("Birth_date","22/09/1998");
            js.put("Birt_place","Bhopal");
            js.put("COUNTRY","India");

            FileWriter fi= new FileWriter("C:\\Users\\NTS-Bhushan Dere\\IdeaProjects\\CsvF2\\Df\\data.json");
            fi.write(js.toJSONString());
            System.out.println("write json data successfully");
            fi.close();

        }catch (Exception e){
            System.out.println("something is wrong");
        }

    }
    public static void readJSON(){
        JSONParser js=new JSONParser();
        try{
            JSONObject jsonObject = (JSONObject) js.parse(new FileReader("C:\\Users\\NTS-Bhushan Dere\\IdeaProjects\\CsvF2\\Df\\data.json"));
            String id = (String) jsonObject.get("ID");
            String first_name= (String) jsonObject.get("NAME");
            String birth_date = (String) jsonObject.get("Birth_date");
            String birth_place= (String) jsonObject.get("Birth_place");
            String Country = (String) jsonObject.get("Country");

            //
            System.out.println("contents are:");
            System.out.println("ID:" +id);
            System.out.println("first_name"+first_name);
            System.out.println("birth_date"+birth_date);
            System.out.println("birth_place"+birth_place);
            System.out.println("country"+Country);
            System.out.println("  ");

            System.out.println("\n Reading json file ");
        }catch (Exception e){
            System.out.println("something is wrong");
        }
    }
}
