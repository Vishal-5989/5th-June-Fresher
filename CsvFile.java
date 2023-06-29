package MavenPro;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CsvFile {
    public static void main(String[] args) throws IOException {
        //Instantiating the CSVWriter class
        CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\NTS-Asmita Raut\\IdeaProjects\\javaProject\\file.csv"));
        //Writing data to a csv file
        String line1[] = {"id", "name", "mail_id", "dept"};
        String line2[] = {"1", "Asmita", "asmitaraut2212@gmail.com","IT"};
        String line3[] = {"2", "Vaishu", "vish45@gmail.com","Product"};
        String line4[] = {"3", "Rutuja", "rutuja98@gmail.com","HR"};
        String line5[] = {"4", "Raghav", "raghushastri21@gmail.com", "QA"};
        //Writing data to the csv file
        writer.writeNext(line1);
        writer.writeNext(line2);
        writer.writeNext(line3);
        writer.writeNext(line4);
        writer.writeNext(line5);
        //Flushing data from writer to file
        writer.flush();
        System.out.println("Data entered");
        //to read csv file
        Scanner sc = new Scanner(new File("C:\\Users\\NTS-Asmita Raut\\IdeaProjects\\javaProject\\file.csv"));
        sc.useDelimiter("@");//to set the delimiter pattern and evaluating string
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
        sc.close();



    }
}
