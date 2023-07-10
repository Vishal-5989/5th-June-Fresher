package String;

import java.util.Scanner;
import java.util.*;

public class StringMethod
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();


        System.out.println("Your Name is "+name);



        String first_name ="Jay";
        String last_name = "Bafna";
        // concat
        String full_name =first_name +" " +last_name;
        System.out.println(full_name);
        System.out.println(full_name.length());


        // charAt Particular Index
        for(int i=0; i<full_name.length();i++)
        {
            System.out.println(full_name.charAt(i));
        }


        //comparing two strings
        String str1 ="Tony";
        String str2="TOny";
        if(str1.compareTo(str2)==0)
        {
            System.out.println("String are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }


        //Sub String
        String sentence ="My name is tony stark";
        String name1 = sentence.substring(11,16 );
        String name2 = sentence.substring(0,7);
        System.out.println(name1);
        System.out.println(name2);


        //parse int method
        String num ="12345";
        int number = Integer.parseInt(num);
        System.out.println(number);

        // parse int to string
        int num1 =1234567890;
        String numb = Integer.toString(num1);
        System.out.println(numb);


        //strip
        // return string and remoes white spaces
        String ab = "     JayBafna   ";
        String abstriped = ab.strip();
        System.out.println(abstriped);

        //split



        //StrinBuilder

        StringBuilder sb = new StringBuilder("Thor ");
        System.out.println(sb);
        System.out.println(sb.charAt(0));

        //set charcter at index
        sb.setCharAt(0,'T');
        System.out.println(sb);

        //insert charter at index in String
        sb.insert(0,"Java");
        System.out.println(sb);

        //delete element in string

        sb.delete(0,4);
        System.out.println(sb);

        sb.append("son of odin");
        System.out.println(sb);

        // string reverse using string builder
        sb.reverse();
        System.out.println(sb);

        //replace method
        String original = "eabcdef" ;
        System.out.println(original.replace('e','i'));






    }
}
