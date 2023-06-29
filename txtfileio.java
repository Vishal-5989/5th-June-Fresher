import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class txtfileio {
    public static void main(String[] args) {

        //code to create new file
        /*
        File myFile = new File ("txtfileio.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to crate file :");
            e.printStackTrace();
        }

         */

        //code to write a new file
        /*
        try {
            FileWriter fileWriter = new FileWriter("txtfileio.txt");
            fileWriter.write("This is my first file in io java :\n okay lets go....!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

         */

        /*
        //code to read

        File myFile = new File("txtfileio.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

         */
        File myFile = new File("txtfileio.txt");
        if(myFile.delete()){
            System.out.println("I have deleted :"+ myFile.getName());
        }
        else{
            System.out.println("Some error occured while deleting the file...");
        }


    }
}
