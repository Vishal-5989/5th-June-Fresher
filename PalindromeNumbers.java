public class PalindromeNumbers {
    public static void main(String[] args) {
        System.out.println("Palindrome numbers between 11 and 999:");

        for (int i = 11; i <= 999; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}

