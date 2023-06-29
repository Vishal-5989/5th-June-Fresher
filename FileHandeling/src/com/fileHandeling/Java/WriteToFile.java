package com.fileHandeling.Java;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void write()
    {
        try
        {
            FileWriter myWriter = new FileWriter("C:\\Users\\NTS-Pradip Khandare\\Documents\\firstFileCreatedByFileHand.txt");
            myWriter.write("Hey congratulations man you are doing good!!!");
            myWriter.close();
            System.out.println("Succesfully wrote to the file");
        } catch (IOException e) {
            System.out.println("Error occured");
            e.printStackTrace();
        }
        {

        }
    }

}
