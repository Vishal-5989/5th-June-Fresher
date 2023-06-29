import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

    static void stringRev(String str)
    {
     String[] temp = str.split("\\s");

     String revString = "";

     for(int i = 0; i<temp.length; i++)
     {
         String word = temp[i];
         String revWords = "";

         for(int j = word.length()-1; j>=0;j--)
         {
             revWords = revWords + word.charAt(j);
         }
         revString = revString + revWords + " ";
     }
     System.out.println("Reverse String : "+revString);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String you want to reverse");
        String s = sc.nextLine();
        System.out.println("original String :"+s);
       stringRev(s);

    }

}
