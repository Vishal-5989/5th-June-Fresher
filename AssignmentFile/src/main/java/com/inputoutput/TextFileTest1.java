package com.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TextFileTest1 {

    public void input() {

        try {
            FileOutputStream out = new FileOutputStream("C:\\Assignments27\\file.txt");
            String str = "Java  ";

            byte[] b = str.getBytes();
            out.write(b);
            out.close();
            System.out.println("Successful");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void output(){
        try{
            System.out.println();
            FileInputStream in=new FileInputStream("C:\\Assignments27\\file.txt");
            int i;
            while((i=in.read())!=-1){
                System.out.println((char)i);
            }
            in.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}