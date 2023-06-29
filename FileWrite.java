import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\NTS-Sulakshana Pawar\\Desktop\\FileHandle.txt");
        f.createNewFile();
        f.canRead();
        FileWriter myWriter=new FileWriter("C:\\Users\\NTS-Sulakshana Pawar\\Desktop\\FileHandle.txt");
        myWriter.write("Hey!!");
        myWriter.close();
        System.out.println("Successfully wrote to the file");



    }
}

