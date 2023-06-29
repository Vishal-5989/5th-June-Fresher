import java.util.Scanner;

public class Fibnoascii {

    public int fibnoasciiSeries(int n)
    {
        int firstNo = 0, secNo = 1;
        int i = 1;
        System.out.println("Fibonacci series are ");
        while(i <= n)
        {

           System.out.print(firstNo + ",");
            int nextNo = firstNo + secNo;
            firstNo = secNo;
            secNo = nextNo;
          i++;

        }

        return firstNo;

    }



    public static void main(String[] args)
    {
        Fibnoascii fb = new Fibnoascii();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print Fibnoascii Series");
        int a = sc.nextInt();


        int result = fb.fibnoasciiSeries(a);


    }
}
