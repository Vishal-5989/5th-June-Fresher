public class Palindrome {
    public static void main(String[] args) {

        for (int a = 11; a <= 9999; a++) {
            int rev = 0;
            int n = a;

            while (n > 0) {
                rev = rev * 10 + a % 10;
                n = n / 10;
            }
            if (rev == a) {
                System.out.println(a + " ");
            }


        }

    }
}