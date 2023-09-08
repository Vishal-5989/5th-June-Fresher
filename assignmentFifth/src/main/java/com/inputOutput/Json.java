package com.inputOutput;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Json {
    public void input(){
        // write
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName", "Vishal");
        employeeDetails.put("lastName", "Kadiya");
        employeeDetails.put("middleName", "Sanjaybhai");
        employeeDetails.put("mobilenumber", "9408487051");
        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);

        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Devarsh");
        employeeDetails2.put("lastName", "Shah");
        employeeDetails2.put("middleName", "Rajeshbhai");
        employeeDetails2.put("mobilenumber", "1234567890");
        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee", employeeDetails2);

        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);

        try{
            File f = new File("C:\\Assignment\\employee.json");
            FileWriter file = new FileWriter(f);
            file.write(employeeList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void output(){
        // read
        JSONParser jsonParser = new JSONParser();

        try {
            FileReader reader = new FileReader("C:\\Assignment\\employee.json");
            Object obj = jsonParser.parse(reader);

            System.out.println("\n*** Returning an object ***\n");

            JSONArray employeeList = (JSONArray) obj;
            for (int i = 0; i < employeeList.size(); i++){
                Object employee = employeeList.get(i);
                System.out.println(employee);
            }
            System.out.println("\n*** Returning data in json format ***\n");

            System.out.println("{");
            for (int i = 0; i < employeeList.size(); i++){
                JSONObject employee = (JSONObject) employeeList.get(i);
                JSONObject employeeObject = (JSONObject) employee.get("employee");

                Set<String> key = employeeObject.keySet();
                List<String> stringsList = new ArrayList<>(key);

                Collection values = employeeObject.values();
                List<String> valuesList = new ArrayList<>(values);

                int j=0,k = 0;
                while(k < employeeList.size() - 1){
                    System.out.println("\t{\n\t\t employee:{");
                    while (j < stringsList.size() && j < valuesList.size()){
                        System.out.println("\t\t\t\""+stringsList.get(j)+"\":"+"\""+valuesList.get(j)+"\",");
                        j++;
                    }
                    System.out.println("\t\t}\n\t},");
                    k++;
                }
            }
            System.out.println("}");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
