import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        /*System.out.println("Enter your number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        for (int i=2;i<a;i++){

            if(a%i==0){
                count++;
            }

        }

        if(count>0){

            System.out.println(a+" is not prime number");
        }
        else {
            System.out.println(a+" is prime nuumber");
        }*/


        System.out.println("Enter the limit ");
        Scanner sc=new Scanner(System.in);
        int limit =sc.nextInt();
        for (int i=1;i<=limit;i++){
            int count=0;
            for (int j=2;j<=i-1;j++){

                if (i%j==0){
                    count++;
                }

        }
            if (count==0){
                System.out.println(i);
            }


        }















    }

}
