package com.inputoutput;


import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TextTest {


    public void input(){

        try{
            FileOutputStream out = new FileOutputStream("C:\\Users\\NTS-Jyoti Daundkar\\Desktop\\File.txt");
            String str = "Hello To the World";

            byte b[] = str.getBytes();
            out.write(b);
            out.close();
            System.out.println("Successful");


        } catch (Exception e){
            System.out.println(e);
        }

    }

    public void output(){
        try {
            System.out.println();
            FileInputStream in=new FileInputStream("C:\\Users\\NTS-Jyoti Daundkar\\Desktop\\File.txt");
            int i=0;
            while ((i=in.read())!=-1){
                System.out.println((char)i);
            }
            in.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
