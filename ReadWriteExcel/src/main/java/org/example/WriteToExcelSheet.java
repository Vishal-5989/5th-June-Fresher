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

public class WriteToExcelSheet {
    public static void write() {
        String[]  rowHeading = {"FirstName", "LastName", "Email"};
        List<User> users = createUser();
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet spreadsheet = workbook.createSheet("User Details");
        Row headerRow =  spreadsheet.createRow(0);

        //creating header
        for(int i = 0; i< rowHeading.length;i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(rowHeading[i]);
        }

        //creating data row for each user
        for(int i = 0; i < users.size(); i++) {
            Row dataRow = spreadsheet.createRow(i + 1);
            dataRow.createCell(0).setCellValue(users.get(i).getFirstName());
            dataRow.createCell(1).setCellValue(users.get(i).getLastName());
            dataRow.createCell(2).setCellValue(users.get(i).getEmail());
        }

        //write the workbook in my system
        FileOutputStream out;
        try
        {
            out = new FileOutputStream("C:\\Users\\NTS-Pradip Khandare\\Documents\\user.xlsx");
            workbook.write(out);
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO Exception");
            e.printStackTrace();
        }

        System.out.println("write to excel sheet succesfully...!");
    }

    private static List<User> createUser() {
        List<User> users = new ArrayList<User>();
        users.add(new User("Pradip", "Khandare", "prad@gmail.com"));
        users.add(new User("Tukaram", "Bedke", "tuks@gmail.com"));
        users.add(new User("Sandip", "Maheshwari", "sand@gmail.com"));
        users.add(new User("Vijay", "Gandhare", "vij@gmail.com"));
        return users;
    }

}
