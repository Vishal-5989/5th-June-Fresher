import java.util.Scanner;

public class Fibonacci {

    void fibonacci(){
        int first_number=0,second_number=1, total,i,range;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range for fibonacci series:");
        range = sc.nextInt();
        System.out.print(first_number+" "+second_number);

        for(i=0; i<range-2; i++)
        {
            total = first_number+second_number;
            System.out.print(" "+total);
            first_number = second_number;
            second_number = total;
        }



    }
}
