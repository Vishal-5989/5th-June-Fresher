import java.util.Scanner;

public class String_Methods {
    public static void main(String[] args) {


        System.out.println("Enter the method you want to choose");
        System.out.println("Select from length, split, equalsigonorecase, trim, indexof");
        System.out.println("Write choice only in capital letters");

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        switch(str){

            case"LENGTH":
                System.out.println(str.length());
                break;

            case "SPLIT":
                String[] strarr=str.split(" ");
                for (String i :strarr)
                      {
                          System.out.println(i);
                      }
                break;

            case"EQUALSIGONRECASE":
                System.out.println("Enter the string which you want to compare");
                String Str2=sc.nextLine();
                System.out.println(str.equalsIgnoreCase(Str2));
                break;


            case"TRIM":

                System.out.println(str.trim()+"String Trim");
                break;

            case"INDEXOF":
                System.out.println(str.indexOf(2));
                break;

            default:
                System.out.println("Wrong Choice");
                break;

        }

    }

}
