import java.util.Scanner;

public class PrintPrimeNumberFromZeroToThousandUserDefined {
    public static void main(String[] args) {
        System.out.println("Enter last number upto there you want prime numbers : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count;
        for(int i = 2; i<=num; i++)
        {
            count = 0;
            for(int j = 1; j<=i; j++)
            {
                if(i%j == 0)
                {
                    count++;
                }
            }
            if(count == 2)
            {
                System.out.print(i+" ");
            }
        }

    }
}
