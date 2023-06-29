import com.opencsv.CSVWriter;
import com.opencsv.ICSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileWriteAndReadcsv {
    public static void main(String[] args) throws IOException {
        //instatiating csv writer //filewriter:to write data into file
        CSVWriter writer =new CSVWriter((new FileWriter(("C:\\Users\\NTS-Rutuja Tathe\\IdeaProjects\\File3.csv"))));
        //writing data to csv file
        String line1[]={"id","Name","Mail id","dept"};
        String line2[]={"1","Rutuja","rutujatathe.2211@gmail.com","Computer"};
        String line3[]={"2","Asmita","asmitaraut2345@gmail.com","entc"};
        String line4[]={"3","megha","meghahirmukhe@gmail.com","electrical"};

        //writeNext:writing data into csv file
//        writer.writeNext(line1);
//        writer.writeNext(line2);
//        writer.writeNext(line3);
//        writer.writeNext(line4);

      //  arraylist to handle the data
        List l=new ArrayList<>();
        l.add(line1);
        l.add(line2);
        l.add(line3);
        l.add(line4);
        writer.writeAll(l);
        writer.flush();

        //read csv file//flush all data to create csv file data
        writer.flush();
        System.out.println("Data entered");

        Scanner sc=new Scanner(new File("C:\\Users\\NTS-Rutuja Tathe\\IdeaProjects\\File3.csv"));
        sc.useDelimiter("@");  //sets the delimiter pattern
        while(sc.hasNext()){  //returns boolean value
            System.out.println(sc.next()); //find and return the line
        }
        sc.close(); //close scanner

    }
}


