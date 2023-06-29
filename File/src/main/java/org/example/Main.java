package org.example;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Create a new workbook
        Workbook workbook = new XSSFWorkbook();

        // Create a new sheet
        Sheet sheet = workbook.createSheet("Sheet1");

        // Create some data
        Object[][] data = {
                {"Name", "Age", "Country"},
                {"John", 25, "USA"},
                {"Alice", 30, "UK"},
                {"Bob", 35, "Canada"}
        };

        // Write data to the sheet
        int rowNum = 0;
        for (Object[] rowData : data) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : rowData) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        // Save the workbook to a file
        String filename = "data.xlsx";
        try (FileOutputStream fileOut = new FileOutputStream(filename)) {
            workbook.write(fileOut);
            System.out.println("Excel file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
