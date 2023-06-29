import java.util.Scanner;

public class CountDigit {
    public static void count(long n)
    {
        int count = 0;
        do{
          n = n/10;
          ++count;
        }while(n != 0);
        System.out.println("Number of Digits is : "+count);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        long n = in.nextLong();
        count(n);
    }

}
