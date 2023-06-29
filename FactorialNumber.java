import java.util.Scanner;

public class FactorialNumber {
    public static int factorial(int n){
        int factorial1 = 1;
        for(int i=n; i>=1;i++){
            factorial1 = factorial1 * i;
            System.out.println(factorial1);


        }
        return factorial1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);756
        int n = sc.nextInt();
        System.out.println("factorial"+ factorial(n));

    }
}
