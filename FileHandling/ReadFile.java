import java.io.FileReader;
import com.opencsv.CSVReader;
public class ReadFile{
    public static void main(String args[]) throws Exception {

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

}

