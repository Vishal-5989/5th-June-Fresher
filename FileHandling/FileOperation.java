package FileHandling;
import java.io.*;
import java.util.*;

public class FileOperation
{
    public static void readFile(){
        try {
            FileInputStream fin= new FileInputStream("C:\\Users\\NTS-Jinendra Bafna\\Desktop\\jay.txt");
            Scanner sc = new Scanner(fin);
            if (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Txt File Not Found");
        }
    }
    public static void writeFile() {
        try {
            FileWriter file = new FileWriter("C:\\Users\\NTS-Jinendra Bafna\\Desktop\\jay.txt");
            file.write(" This is new File Affter write New Data");
            file.close();
            System.out.println("File Write Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

        public static void createFile()
    {
        try {

            File obj = new File("test.txt");
            obj.createNewFile();

            System.out.println("File Create Successfully");


        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public  static  void delete()
    {
        File obj = new File("C:\\Users\\NTS-Jinendra Bafna\\Desktop\\jay.txt");
        System.out.println(obj.delete());

    }




    public static void main(String[] args)
    {
        //FileOperation.readFile();
        //FileOperation.writeFile();
        //FileOperation.createFile();
        FileOperation.delete();
    }

}
