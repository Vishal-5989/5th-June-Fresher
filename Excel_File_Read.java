import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class Excel_File_Read {
    public static void main(String[] args) {
try {
  //  String path="C:\\Users\\NTS-Yogesh Hadpad\\Downloads\\File\\Excel.xls";
    FileInputStream filpath = new FileInputStream("C:\\Users\\NTS-Yogesh Hadpad\\Downloads\\File\\Book1.xlsx");
    XSSFWorkbook workbook=new XSSFWorkbook(filpath);

    XSSFSheet  sheet =workbook.getSheet("Sheet1");





    int row=sheet.getLastRowNum()+1;
    int colum=sheet.getRow(1).getLastCellNum();

    for (int i=0;i<row;i++){
        XSSFRow row1=sheet.getRow(i);

        for (int j=0;j<colum;j++){
            XSSFCell cell=row1.getCell(j);
            switch (cell.getCellType()){
                case STRING:
                    System.out.printf("%d-10s"+cell);
                    break;
                case NUMERIC:
                    System.out.print(cell);
                    break;

            }
            System.out.println();
        }

    }















}




catch (Exception e){
    System.out.println(e);
}




    }
}
