import java.math.BigInteger;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        BigInteger number = scanner.nextBigInteger();

        // Convert the number to a string and get the length
        String numToString = number.toString();
        int lenOfDigits = numToString.length();


        System.out.println("Number of digits: " + lenOfDigits);

        scanner.close();
    }
}
