import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

    try {
        int num = 50 / 0;
        System.out.println("We are in try block");
    } catch (ArithmeticException e)
    {
        System.out.println(e);
    }



    //By using Finally block
        try {
            int x = 10 / 0;

        } catch(ArithmeticException e) {

            System.out.println(e);
        }
        finally {
            System.out.println("I don't care, I am going to executes");
        }



    }

}