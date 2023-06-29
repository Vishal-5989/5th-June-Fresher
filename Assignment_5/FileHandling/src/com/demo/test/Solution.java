package com.demo.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {

    public void fileWriter(){
        try {
            FileWriter f=new FileWriter("C:\\Users\\NTS-Rahul Raut\\FileHandling\\src\\com\\demo\\test\\file.text");
            f.write("Love the life ");
            System.out.println("Successful writing the data in the file file.txt using Java FileWriter class");
            f.close();

        }catch (Exception e){
            System.out.println(" Please provide absolute path of file ");
        }
        }

        public void fileReader()  {
            try{
                FileReader fr=new FileReader("C:\\Users\\NTS-Rahul Raut\\FileHandling\\src\\com\\demo\\test\\file.text");
                int i;
                while((i=fr.read())!=-1)

                    System.out.print((char)i);
                    fr.close();
                System.out.println("\n Reading the file is Success");

            }catch (Exception e){
                System.out.println(" Please provide absolute path of file ");
            }

        }
}
