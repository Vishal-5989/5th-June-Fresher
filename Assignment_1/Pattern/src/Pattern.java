import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int i,j,k;
        System.out.print("Input number of rows !! ");
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        for(i=0;i<=k;i++)
        {
            for(j=1;j<=k-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for(i=k-1;i>=1;i--)
        {
            for(j=1;j<=k-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
