import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice;
        System.out.println("*********************Your choices**************************");
        System.out.println("(1) Creating string method");
        System.out.println("(2) Revering the word in string");
        System.out.println("(3) Count character in string");
        System.out.println("(4) StringBuffer");
        System.out.println("(5) StringBuilder");

        System.out.println("***********************************************************");

        System.out.println("Enter your choice here: ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice){
            case 1:
                StringMethod s = new StringMethod();
                System.out.println("-------------------creating a string");
                s.createString();
                System.out.println("-------------------charAt function");
                s.charAt();
                System.out.println("-------------------length of a string");
                s.length();
                System.out.println("-------------------string format function");
                s.stringFormat();
                System.out.println("-------------------substing function");
                s.subString();
                System.out.println("-------------------another example of substring");
                s.subString2();
                System.out.println("-------------------contain function");
                s.contain();
                System.out.println("\n-------------------join function");
                s.join();
                System.out.println("\n-------------------equals function");
                s.equals();
                System.out.println("-------------------isEmpty fucntion");
                s.isEmpty();
                System.out.println("-------------------concat function");
                s.concat();
                System.out.println("-------------------replace function");
                s.replace();
                System.out.println("-------------------another example of replace function");
                s.replace2();
                System.out.println("-------------------equals ignore function");
                s.equalsIgnore();
                System.out.println("-------------------split function");
                s.split();
                System.out.println("-------------------another example of split function");
                s.split2();
                System.out.println("-------------------intern function");
                s.intern();
                System.out.println("-------------------index of function");
                s.indexOf();
                System.out.println("-------------------toLowercase function");
                s.toLowerCase();
                System.out.println("-------------------toUpercase function");
                s.toUpperCase();
                System.out.println("-------------------trim function");
                s.trim();
                System.out.println("-------------------strip function");
                s.strip();
                System.out.println("-------------------value function");
                s.value();
                System.out.println("-------------------this is a tostring method");
                s.toStringmethod();
                break;

            case 2:
                System.out.println("Enter the string for reversing word");
                Scanner str = new Scanner(System.in);

                String name="";
                name = name + str.nextLine();
                str.close();

                ReverseWord r = new ReverseWord();
                r.reverseWord(name);
                break;

            case 3:
                CountCharacter c = new CountCharacter();
                c.countCharacter();
                break;

            case 4:
                Stringbuffer sb = new Stringbuffer();
                sb.stringBuffer();
                break;

            case 5:
                Stringbuilder sbuild = new Stringbuilder();
                sbuild.stringBuilder();
                break;

            default:
                System.out.println("Invalid choice");
        }

    }
}