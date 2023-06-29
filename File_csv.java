import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_csv {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\NTS-Asmita Raut\\IdeaProjects\\javaProject\\file.csv");
        if(file.createNewFile()){
            System.out.println(file.getName()+" csv file is successfully created. ");
            System.out.println("is created file is readable: "+file.canRead());
            System.out.println("is created file is writeable: "+file.canWrite());
            System.out.println("Size of created file: "+file.length());
        }
    }
}
