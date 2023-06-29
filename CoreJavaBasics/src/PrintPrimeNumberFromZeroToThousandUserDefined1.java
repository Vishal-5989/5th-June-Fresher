import java.util.Scanner;

public class PrintPrimeNumberFromZeroToThousandUserDefined1 {
    public static void main(String[] args) {
        System.out.print("Enter number here: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count;
        for(int i = 2; i<=n; i++)
        {
            count = 0;
            for(int j= 1; j<=i; j++)
            {
                if(i % j == 0)
                {
                    count++;
                }
            }
            if(count == 2)
            {
                System.out.print(i+ " ");
            }
        }

    }
}
