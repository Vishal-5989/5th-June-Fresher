import java.util.Scanner;

public class String_Count {


    public static void main(String[]args){

        System.out.println("Enter the string");
       //String str="Yogeah Hadpad";
       Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

       int count=0;
        for (int i=0;i<str.length();i++){

            if(str.charAt(i)!=' '){

                count++;
            }
        }

        System.out.println("Total number of characters in the given string are "+ count );

    }







}
