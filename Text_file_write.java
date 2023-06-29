import java.io.FileWriter;

public class Text_file_write {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("C:\\Users\\NTS-Yogesh Hadpad\\Downloads\\File\\TextFileWrite.txt");
            myWriter.write("Writing into the text file through java code");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (Exception e){

        }
    }
}
