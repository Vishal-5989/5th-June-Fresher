import java.io.FileWriter;
import com.opencsv.CSVWriter;
public class WriteFile {
    public static void main(String args[]) throws Exception {

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
        System.out.println("Data entered ");
    }
}

