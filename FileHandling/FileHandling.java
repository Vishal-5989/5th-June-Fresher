
import java.io.BufferedReader;
import java.io.FileReader;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    public static void writeTxt() {
        Scanner c = new Scanner(System.in);
        try{
            FileWriter fwrite = new FileWriter("C:\\Users\\NTS-Sakshi Saha\\Desktop\\Assignment\\Task.txt");
            System.out.println("Enter text ");
            String s = c.next();
            fwrite.write(s);
            fwrite.close();

            System.out.println("message wrote completly");
        }
        catch(IOException e)
        {
            System.out.println("error found in file");
            e.printStackTrace();
        }
    }

    public static void readTxt() {
        try{
            FileReader fr = new FileReader("C:\\Users\\NTS-Sakshi Saha\\Desktop\\Assignment\\Task.txt");
            BufferedReader bf = new BufferedReader(fr);
            String line;
            while ((line = bf.readLine()) != null)
            {
                System.out.println(line);
            }
            fr.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void writeCsv() throws IOException {
        CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\NTS-Sakshi Saha\\Desktop\\Assignment\\Task.csv"));

        String line1[] = {"id", "name", "dept"};
        String line2[] = {"1", "Sakshi", "IT"};
        String line3[] = {"2", "Rutuja", "IT"};
        String line4[] = {"3", "Asmita", "IT"};

        writer.writeNext(line1);
        writer.writeNext(line2);
        writer.writeNext(line3);
        writer.writeNext(line4);

        writer.flush();
        System.out.println("Data entered done ");
    }
    public static void readCsv() throws IOException, CsvValidationException {
        CSVReader reader = new CSVReader(new FileReader("C:\\Users\\NTS-Sakshi Saha\\Desktop\\Assignment\\Task.csv"));

        StringBuffer buffer = new StringBuffer();
        String line[];
        while ((line = reader.readNext()) != null) {
            for(int i = 0; i<line.length; i++)
            {
                System.out.print(line[i] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) throws CsvValidationException, IOException {

        int choice;
        do {
            System.out.println("0.Exit\n1.readfile using txt\n2.writefile using txt\n3.readfile using csv\n4.writefile using csv");
            Scanner c = new Scanner(System.in);
            System.out.println("select valid choice");
            choice = c.nextInt();


            switch (choice) {
                case 1:
                    readTxt();
                    break;
                case 2:
                    writeTxt();
                    break;
                case 3:
                    readCsv();
                    break;
                case 4:
                    writeCsv();
                    break;
                default:
                    System.out.println("Thank You !!");
            }
        } while (choice > 0);
    }
}
