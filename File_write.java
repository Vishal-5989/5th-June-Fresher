import java.io.FileWriter;
import java.io.IOException;

public class File_write {
    public static void main(String[] args) throws IOException {
        FileWriter write = new FileWriter("C:\\Users\\NTS-Asmita Raut\\IdeaProjects\\javaProject\\Asmitafile.txt");
        write.write("File created for demo purpose by Asmita.");
        write.close();
        System.out.println("Content is successfully wrote to the file.");
    }
}
