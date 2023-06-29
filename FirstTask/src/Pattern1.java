import java.util.Scanner;

public class Pattern1 {
    public static void patternProg1(int row)
    {
        int i,j;
        for(i =0;i<row;i++)
        {
            for(j = row-i;j>1;j--) {
                System.out.print(" ");
            }
            for(j= 0;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();

        }
        for(i =row;i>=0;i--)
        {
            for(j = row-i;j>1;j--) {
                System.out.print(" ");
            }
            for(j= 0;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }



    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int row = sc.nextInt();
        patternProg1(row);


    }
}
