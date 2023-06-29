package com.fileHandeling.Java;

import java.io.File;

public class FileInformation {

    public static void info()
    {
        File myObj1 = new File("C:\\Users\\NTS-Pradip Khandare\\Documents\\fileHandeling.txt");
        if(myObj1.exists())
        {
            System.out.println("File Name : "+ myObj1.getName());
            System.out.println("Absolute Path : "+ myObj1.getAbsolutePath());
            System.out.println("Writable : "+myObj1.canWrite());
            System.out.println("Readable : "+myObj1.canRead());
            System.out.println("File Size in Byte : "+myObj1.length());
        } else {
            System.out.println("file does not exist");
        }
    }
}
