import java.io.File;
import java.io.IOException;

public class FileHandling_txt {
    public static void main(String[] args)  {
        File f=new File("C:\\Users\\NTS-Rutuja Tathe\\IdeaProjects\\file6.txt");
        try {
            if (f.createNewFile()) {
                System.out.println(f.getName()+"  created sucessfully.");

            }
            else{
                System.out.println("File is exists or already created.");
            }
        }catch(IOException e){

            System.out.println("Some error occured.");
            e.printStackTrace();
        }

    }
}
