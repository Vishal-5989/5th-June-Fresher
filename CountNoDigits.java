import java.util.Scanner;

public class CountNoDigits {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Enter integer number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println("Number of digits present : "+count);
    }
}
