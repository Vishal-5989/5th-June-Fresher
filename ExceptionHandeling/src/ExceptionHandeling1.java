import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandeling1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 0, c, d, f;
        try
        {
            Scanner sc  = new Scanner(System.in);
            System.out.println("enter a : ");
            a = sc.nextInt();
            System.out.println("enter b : ");
            b = sc.nextInt();
            System.out.println("enter c : ");
            c = sc.nextInt();
            d = a/b;
            System.out.println(d);
            f = a%c;
            System.out.println(f);
            FileInputStream fis = null;
            fis = new FileInputStream("B:/myfile.txt");
            int k;
            while ((k = fis.read()) != -1)
            {
                System.out.println((char)k);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
