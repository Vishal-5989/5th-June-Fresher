import java.util.Scanner;

public class countThedigitPresentInTheInteger1 {
    public static void main(String[] args) {
        System.out.print("Enter your number here man : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num > 0)
        {
            num = num / 10;
            ++count;
        }
        System.out.println("The total digit present in the number is : "+count);

    }
}
