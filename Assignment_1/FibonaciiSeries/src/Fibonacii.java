import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Fibonacii {
    public  void fiboSeries(int x){
        int ans=0;
        int a=0;
        int b=1;
        System.out.print(a+" "+b);
        for (int i=2;i<x;i++){
            ans=a+b;
            System.out.print(" "+ans);
            a=b;
            b=ans;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Fibonacii fibo=new Fibonacii();
        System.out.println("Fibonaciii Series !!! ");
        System.out.print("Enter The Number !!");
        int num=sc.nextInt();
        fibo.fiboSeries(num);      // Call The Function
    }
}
