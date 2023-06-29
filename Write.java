package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Write {
    public static void write() {
        try{
            String[] heading= {"FirstName","LastName","Email"};
            List<User> users = createUser();
            XSSFWorkbook workbook=new XSSFWorkbook();
            XSSFSheet sheets =workbook.createSheet("MyFirstSheet");
            Row headerRow = sheets.createRow(0);

            for (int i=0;i<users.size();i++){
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(heading[i]);
            }
            for (int i=0;i<users.size();i++){
               Row dataRow= sheets.createRow(i+1);
               dataRow.createCell(0).setCellValue(users.get(i).getFirstName());
               dataRow.createCell(1).setCellValue(users.get(i).getLastName());
               dataRow.createCell(2).setCellValue(users.get(i).getEmail());
            }

            FileOutputStream out;
            try{
                out = new FileOutputStream("C:\\Users\\NTS-Bhushan Dere\\IdeaProjects\\CRW\\Demo\\Test.xls");
                workbook.write(out);
                out.close();


            }
            catch (FileNotFoundException e){
                e.printStackTrace();

            }catch (IOException e){
                e.printStackTrace();
            }
            System.out.println("Data inserted Successfully");




        }
        catch(Exception e){

        }
    }

    private static List<User>  createUser() {
        List<User> users = new ArrayList<>();
        users.add(new User("Pradip","Khandare","pkhandare123"));
        users.add(new User("Shubham","Chaudhary","schaudhaery456"));
        users.add(new User("Suraj","Kokare","suraj987"));
        return users;
    }
}
