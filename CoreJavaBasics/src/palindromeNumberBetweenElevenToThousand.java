import java.util.Scanner;

public class palindromeNumberBetweenElevenToThousand {

    public static void main(String[] args) {
        int n, b, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number N : ");
        int N = sc.nextInt();
        System.out.println("Palindrome number from 11 to "+ N);
        for(int i = 11; i <= N; i++)
        {
            n=i;
            while (n > 0)
            {
                b = n % 10;
                rev = rev * 10 + b;
                n = n / 10;

            }
            if(rev == i)
            {
                System.out.print(i + " ");
            }
            rev = 0;
        }
    }
}
