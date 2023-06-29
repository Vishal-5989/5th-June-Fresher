import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Num = scanner.nextInt();
        boolean isPrime = true;

        if (Num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(Num); i++) {
                if (Num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("The given number is a prime number.");
        } else {
            System.out.println("The given number is not a prime number.");
        }
    }
}
