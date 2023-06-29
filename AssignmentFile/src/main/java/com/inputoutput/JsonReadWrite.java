package com.inputoutput;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonReadWrite {


    public void input() {

        //write in the json file

        JSONObject employeeInfo = new JSONObject();
        employeeInfo.put("first name", "Disha");
        employeeInfo.put("last name", "Gujarathi");
        employeeInfo.put("profession", "Painter");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeInfo);

        JSONObject employeeInfo1 = new JSONObject();
        employeeInfo1.put("first name", "Sahil");
        employeeInfo1.put("last name", "Gujarathi");
        employeeInfo1.put("profession", "Doctor");

        JSONObject employeeObject1 = new JSONObject();
        employeeObject1.put("employee1", employeeInfo1);

        JSONArray employeeList = new JSONArray();
        employeeList.put(employeeObject);
        employeeList.put(employeeObject1);

        try(FileWriter file=new FileWriter("data.json")){
            file.write(employeeList.toString());
            file.flush();
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }

    public void output(){
        //read json file

        JsonParser jsonParser=new JsonParser();

        try(FileReader file=new FileReader("data.json")){

            Object obj=jsonParser.parse(file);
            JSONArray employeeList=(JSONArray) obj;
            System.out.println(employeeList);

        }catch(IOException ae){
            ae.printStackTrace();
        }


    }
}
