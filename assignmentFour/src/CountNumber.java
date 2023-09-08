import java.util.Scanner;

public class CountNumber {
    void countNumber(){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int num = sc.nextInt();
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println("Total number of digits are: "+count);
    }
}
