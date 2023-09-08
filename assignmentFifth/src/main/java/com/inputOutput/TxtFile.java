package com.inputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TxtFile {
    public void input() {
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Assignment\\file.txt");
            String s = "Welcome to file output stream";
            byte b[] = s.getBytes(); // converting strings into byte array
            fout.write(b); // Write whole string in file
            fout.close();
            System.out.println("Input successfully");
        }catch(Exception e){System.out.println(e);}
    }

    public void output(){
        try{
            System.out.println("\nRead whole string from file\n");
            FileInputStream fin = new FileInputStream("C:\\Assignment\\file.txt");
            int i=0;
            while((i=fin.read())!=-1){ // iterate till the value is equal to -1 if value is -1 then --> terminate
                System.out.print((char)i);
            }
            fin.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
