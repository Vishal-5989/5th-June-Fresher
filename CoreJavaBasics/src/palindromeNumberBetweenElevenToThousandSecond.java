import java.util.Scanner;

public class palindromeNumberBetweenElevenToThousandSecond {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your value here : ");
        int value = sc.nextInt();
        int n;
        int rev = 0;
        int b;
        for(int i = 11; i <= value; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                rev = rev * 10 + b;
                n = n / 10;
            }
            if(rev == i)
            {
                System.out.print(i+" ");
            }
            rev=0;
        }


    }
}
