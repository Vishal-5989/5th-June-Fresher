import java.util.Scanner;

public class Diamond {

    public void diamondPattern(int n )
    {
        int col,row;
        for(row = 1; row<=n ; row++)
        {
            for( col = 1; col<=n-row;col++ )
            {
                System.out.print(" ");
            }
            for(col = 1; col <=row*2-1 ; col++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(row = n-1; row>0;row-- )
        {
            for(col = 1; col<=n-row; col++)
            {
                System.out.print(" ");
            }
            for(col = 1; col <= row*2-1; col++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print diamond star pattern");
        int n = sc.nextInt();

        Diamond d = new Diamond();
        d.diamondPattern(n);
    }

}
