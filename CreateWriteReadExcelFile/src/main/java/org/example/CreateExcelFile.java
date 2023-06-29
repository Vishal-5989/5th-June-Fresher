package org.example;

import java.io.File;
import java.io.IOException;

public class CreateExcelFile {

    public static void create(){
                    try
                    {
                        File file = new File("C:\\Users\\NTS-Pradip Khandare\\IdeaProjects\\CreateWriteReadExcelFile\\DemoExcel\\testExcel.xls");
                        if(file.createNewFile())
                        {
                            System.out.println("File created : "+file.getName());
                        } else {
                            System.out.println("File is already created.");
                        }
                    } catch (IOException e) {
                        System.out.println("Exception found");
                        e.printStackTrace();
                    }
    }
}
