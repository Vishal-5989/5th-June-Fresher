import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;

public class CSV_Read {
    public static void main(String[] args) {
        try {
            File fpah = new File("C:\\Users\\NTS-Yogesh Hadpad\\Downloads\\File\\CSVreader.csv");

            //FileReader fread=new FileReader()
            FileReader reader = new FileReader(fpah);
            CSVReader cvread=new CSVReader(reader);
            String []nextrec;
            while ((nextrec=cvread.readNext())!=null){
                for (String cell:nextrec)
                      {
                          System.out.printf("%-10s",cell);


                }
                System.out.println();
            }








        }
        catch (Exception e){

            System.out.println(e);
        }
    }
}
