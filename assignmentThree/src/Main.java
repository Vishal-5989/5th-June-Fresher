import java.io.FileNotFoundException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        TryCatch t = new TryCatch();
        System.out.println("---------------------------------------------");
        System.out.println("1  try catch block");
        System.out.println("2  multiple try catch block");
        System.out.println("3  nested try catch block");
        System.out.println("4  finally exception");
        System.out.println("5  unchecked exception");
        System.out.println("6  checked exception");
        System.out.println("7  userdefine exception");
        System.out.println("8  exception propogation");
        System.out.println("9  throws keyword");
        System.out.println("10 custom exception");
        System.out.println("11 character occurence");
        System.out.println("---------------------------------------------");

        System.out.println("Enter your choice:");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                t.tryCatch();
                break;
            case 2:
                t.multilpleTryCatch();
                break;
            case 3:
                t.nestedTryCatch();
                break;
            case 4:
                t.finallyException();
                break;
            case 5:
                t.uncheckedException();
                break;
            case 6:
                t.checkedException();
                break;
            case 7:
                t.userDefineException();
                break;
            case  8:
                t.exceptionPropogation();
                break;
            case 9:
                t.throwsKeyword();
                break;
            case 10:
                t.customException();
                break;
            case 11:
                Charoccurence c = new Charoccurence();
                c.occurence();
                break;
            default:
                System.out.println("this is a default");
        }
    }
}