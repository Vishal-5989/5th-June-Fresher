import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        for(int i = 1; i < 5 ; i++)//loop for row
        {
            for(int k = 3 ; k >= i ; k--)//loop for spaces
            {
                System.out.print(" ");
            }
//i=2
            for(int j = 1; j <= i ; j++)//loop for column
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i =1; i < 5; i++)//loop for row
        {
            for(int k = 1; k <= i ; k++)//loop for spaces
            {
                System.out.print(" ");
            }

            for(int j = 1; j < 5 -i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
