package com.fileHandeling.Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadsFromFile {

    public static void read()
    {

        try
        {
            File myObj2 = new File("C:\\Users\\NTS-Pradip Khandare\\Documents\\firstFileCreatedByFileHand.txt");
            Scanner sc= new Scanner(myObj2);
            while (sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

}
