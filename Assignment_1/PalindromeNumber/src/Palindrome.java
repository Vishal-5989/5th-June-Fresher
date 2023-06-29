import java.util.Scanner;

public class Palindrome {

    public boolean palindromeNum(int num) {
        int x = num;
        int result = 0;

        while (x != 0) {
            int rem = x % 10;
            result = result * 10;
            result += rem;
            x = x / 10;
        }
        return result == num;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Palindrome pal=new Palindrome();
        System.out.println("Enter The Range Of Numbers!!");
        System.out.println("Enter The First Number!!!");
        int n1=sc.nextInt();
        System.out.println("Enter The Second Number!!!");
        int n2=sc.nextInt();
        int count = 0;
        for (int i = n1; i <= n2; i++) {

            if (pal.palindromeNum(i)) {
                count += 1;
                System.out.println(i);
            }

        }
        System.out.println("Total Number of Palindrome Number is "+count);
    }
}
