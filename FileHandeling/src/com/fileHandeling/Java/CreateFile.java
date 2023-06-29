package com.fileHandeling.Java;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class CreateFile {

    public  static  void fileCreate()
    {
        try
        {
            File myObj =  new File("C:\\Users\\NTS-Pradip Khandare\\Documents\\firstFileCreatedByFileHand.txt");
            if(myObj.createNewFile())
            {
                System.out.println("File Created : "+myObj.getName());
            } else {
                System.out.println("File is already present");
            }
        } catch (IOException e) {
            System.out.println("An error occured : ");
            e.printStackTrace();
        }
    }
}
