import java.util.Scanner;

public class Solution {
    public void countNum(int num){
        int temp=num;
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println("Total number of digits in "+temp+" = "+count);
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number!! ");
        int num=sc.nextInt();
        s.countNum(num);
    }
}
