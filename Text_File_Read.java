import java.io.File;
import java.util.Scanner;

public class Text_File_Read {
    public static void main(String[] args) {
        try {
            File fi  = new File("C:\\Users\\NTS-Yogesh Hadpad\\Downloads\\File\\Textfile.txt");
            Scanner raed = new Scanner(fi);
            while (raed.hasNextLine()) {
                String data = raed.nextLine();
                System.out.println(data);
            }
    }
        catch (Exception  e){
        }
    }
}
