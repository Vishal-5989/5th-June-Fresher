import java.util.Scanner;

public class UserDefinedDiamondPattern {

    public static void main(String[] args)
    {

        System.out.println("Please enter the number of rows here : ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for(int i = 1; i < rows ; i++)//loop for row
        {
            for(int k = rows - 2; k >= i ; k--)//loop for spaces
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i < rows ; i++)//loop for rows
        {
            for(int k = 1; k <= i ; k++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j < rows - i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
