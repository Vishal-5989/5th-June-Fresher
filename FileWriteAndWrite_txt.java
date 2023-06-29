import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteAndWrite_txt {
    public static void main(String[] args) {
        try {
            //Write contents in file

            FileWriter fw = new FileWriter("C:\\Users\\NTS-Rutuja Tathe\\IdeaProjects\\myFile.txt");
            fw.write("My name is Rutuja.\nI have completed BE degree in computer science.");
            fw.close();
            System.out.println("Content is sucessfull added into the file.");

            //Read contents from file
            FileReader fr=new FileReader("C:\\Users\\NTS-Rutuja Tathe\\IdeaProjects\\myFile.txt");
            BufferedReader br=new BufferedReader(fr);
            String line;
            while((line= br.readLine())!=null){
                System.out.println(line);
            }
            br.close();

        }catch(IOException e){
            System.out.println("Some error occured.");
            e.printStackTrace();
        }
    }




}
