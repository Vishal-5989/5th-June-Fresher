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

    public static void main(String[] args)
    {
        FileOperation.readFile();

    }

}
