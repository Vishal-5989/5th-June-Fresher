import java.io.File;
import java.io.IOException;

public class File_Handling {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\NTS-Asmita Raut\\IdeaProjects\\javaProject\\Asmitafile.txt");
        try {
            if(f.createNewFile()){
                System.out.println(f.getName()+ " file is created successfully");
            }
            else {
                System.out.println("File is already exist");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Is the file writable: " + f.canWrite());
    }
}
