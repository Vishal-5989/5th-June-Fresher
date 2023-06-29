package org.example;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import netscape.javascript.JSObject;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.util.*;

public class Solution {

    //write a data in csv file
    public void writeData(){
        try {

            File fi = new File("C:\\Users\\NTS-Rahul Raut\\MavenProjecte\\src\\main\\java\\com\\demo\\file\\data.csv");

            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter(fi);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);

            // create a List which contains String array
            List<String[]> data = new ArrayList<String[]>();
            data.add(new String[] { "Name", "Class", "Marks" });
            data.add(new String[] { "A", "12", "400" });
            data.add(new String[] { "S", "12", "700" });
            writer.writeAll(data);
            System.out.println("Writing the csv data is successfully");

            writer.close();             // closing writer connection
        } catch (Exception e)
        {
            System.out.println("Something is wrong!!!");
            System.out.println(e.getMessage());
        }
    }

    //read the data from csv file
    public void readData(){
        try {
            //Instantiating the CSVReader class
            CSVReader reader = new CSVReader(new FileReader("C:\\Users\\NTS-Rahul Raut\\MavenProjecte\\src\\main\\java\\com\\demo\\file\\data.csv"));
            //Reading the contents of the csv file
            StringBuffer buffer = new StringBuffer();
            String line[];
            while ((line = reader.readNext()) != null) {
                for(int i = 0; i<line.length; i++) {
                    System.out.print(line[i]+"      ");
                }
                System.out.println(" ");
            }
            System.out.println("Reading the csv data is successfully");
        }catch (Exception e){
            System.out.println("Something is wrong");
        }
    }

    //write a data in json file
    public void writejson(){
        try {
            JSONObject js=new JSONObject();     //Creating the json object
            js.put("ID","N0390");
            js.put("NAME","RAHUL RAUT");        //store the value as key and value
            js.put("BIRTH_DATE","22/11/1998");
            js.put("BIRTH_PLACE","JEUR");
            js.put("COUNTRY","INDIA");

            FileWriter fi=new FileWriter("C:\\Users\\NTS-Rahul Raut\\MavenProjecte\\src\\main\\java\\com\\demo\\file\\data.json");
            fi.write(js.toJSONString());        //use filewriter class and write the all value into that file
            System.out.println("Write the json data is successfully");
            fi.close();
        }catch (Exception e){
            System.out.println("Something is wrong");
        }
    }

    //read the data from json filw

    public void readJson(){
        JSONParser js=new JSONParser();     //create the object of jasonparser
        try {

            //Parse the contents of the obtained object using the parse() method.
            JSONObject jsonObject= (JSONObject) js.parse(new FileReader("C:\\Users\\NTS-Rahul Raut\\MavenProjecte\\src\\main\\java\\com\\demo\\file\\data.json"));
            String id = (String) jsonObject.get("ID");
            String first_name = (String) jsonObject.get("NAME");
            String birth_date = (String) jsonObject.get("BIRTH_DATE");
            String birth_place = (String) jsonObject.get("BIRTH_PLACE");
            String country = (String) jsonObject.get("COUNTRY");

            //print the data
            System.out.println("Contents of the JSON are: ");
            System.out.println("ID :"+id);
            System.out.println("First name: "+first_name);
            System.out.println("Last name: "+birth_date);
            System.out.println("Date of birth: "+birth_place);
            System.out.println("Place of birth: "+country);
            System.out.println("Country: "+country);
            System.out.println(" ");

            System.out.println("\n Reading the json data is successfully");
        }catch (Exception e){
            System.out.println("Something is wrong");
        }
    }

}
