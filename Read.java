package org.example;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTRotY;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read {

    public static void readData() throws NullPointerException{
        try
        {
            String path = "C:\\Users\\NTS-Bhushan Dere\\IdeaProjects\\CRW\\Demo\\Test.xls";
            File readFile = new File(path);
            FileInputStream inputData = new FileInputStream(readFile);
            XSSFWorkbook workbook = new XSSFWorkbook(inputData);
            XSSFSheet sheets = workbook.getSheet("sheets");
            int rowNum = sheets.getLastRowNum()+1;
            System.out.println(rowNum);
            XSSFRow row = sheets.getRow(1);
            XSSFCell cell = row.getCell(1);
            String cellData = cell.getStringCellValue();
            System.out.println("My Excel value is " + cellData);
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
