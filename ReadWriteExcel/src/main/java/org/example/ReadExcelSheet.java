package org.example;

import org.apache.poi.hssf.record.RowRecord;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;

public class ReadExcelSheet {
    private static final String Name = "C:\\Users\\NTS-Pradip Khandare\\IdeaProjects\\ReadWriteExcel\\test.xlsx";

    public static void read() {
        try
        {
            FileOutputStream file = new FileOutputStream(new File(Name));
            Workbook workbook = new XSSFWorkbook(file.toString());
            DataFormatter dataFormatter = new DataFormatter();
            Iterator<Sheet> sheets = workbook.sheetIterator();
            while (sheets.hasNext())
            {
                Sheet sh = sheets.next();
                System.out.println("Sheet name as : "+sh.getSheetName());
                Iterator<Row> iterator = sh.iterator();
                while (iterator.hasNext()) {
                    Row row = iterator.next();
                    Iterator<Cell> cellIterator = row.iterator();
                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();
                        String cellValue = dataFormatter.formatCellValue(cell);
//                        if(cell.getCellType() == CellType.STRING) {
//
//                        }
                        System.out.println(cellValue+"\t");
                    }
                    System.out.println();
                }
            }
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
