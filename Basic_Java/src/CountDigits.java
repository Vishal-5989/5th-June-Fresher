import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);

        System.out.println("Number of digits: " + digitCount);
    }

    public static int countDigits(int number) {
        if (number == 0) {
            return 1; // Special case for number = 0
        }

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}
