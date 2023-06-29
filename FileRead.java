import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        FileReader read = new FileReader("C:\\Users\\NTS-Asmita Raut\\IdeaProjects\\javaProject\\Asmitafile.txt");
//        read.read();
        BufferedReader buff = new BufferedReader(read);
        String all;
        while((all = buff.readLine())!= null){
            System.out.println(all);
        }
        buff.close();
    }

}
