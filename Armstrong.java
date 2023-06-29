import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = 0;
        int temp = number;
        int numDigits = String.valueOf(number).length();

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        String result = (sum == number) ? "an Armstrong number." : "not an Armstrong number.";
        System.out.println(number + " is " + result);
    }
}
