package org.example;

import java.io.File;

public class Create {
    public static void createExcel() {
        try
        {
            File obj= new File("C:\\Users\\NTS-Bhushan Dere\\IdeaProjects\\CRW\\Demo\\Test.xls");
            if(obj.createNewFile()){
                System.out.println(obj.getName());

            }else{
                System.out.println("File is already present");
            }

        } catch ( Exception e)
        {
            e.printStackTrace();

        }

    }

}
