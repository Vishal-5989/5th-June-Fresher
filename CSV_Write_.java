
import com.opencsv.CSVWriter;

import java.io.FileWriter;

public class CSV_Write_ {
    public static void main(String[] args) {
        try
        {
            FileWriter f=new FileWriter("C:\\Users\\NTS-Yogesh Hadpad\\IdeaProjects\\csvread.csv");
            CSVWriter csv=new CSVWriter(f);

            String[] data={"Name","Dept","Empid","Contact"};
            csv.writeNext(data);                           //creates heading
            String[] data1={"Jakson","QA","N125","9988599885"};
            csv.writeNext(data1);                           //creating record of emp1
            String[] data2={"Neha","DEV","N200","6677466774"};
            csv.writeNext(data2);                            //creating record of emp2
            System.out.println("Data entered successfully");

            csv.close();
//
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
