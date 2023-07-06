import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter number");
        int number=sc.nextInt();
        int temp,r,sum=0;
        temp=number;
        while(temp>0){
            sum=temp%10;
            count++;
            temp=temp/10;
        }
        System.out.println("Number of digits are"+count);

    }
}
