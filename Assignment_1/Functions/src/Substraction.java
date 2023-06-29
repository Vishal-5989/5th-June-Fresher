import java.util.Scanner;

public class Substraction {
    public int subNum(int num1,int num2){
        int ans=num1-num2;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("The given example of take input and return type i.e method is return something");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number!!");
        int n1=sc.nextInt();
        System.out.println("Enter the second number!!");
        int n2=sc.nextInt();
        Substraction sub=new Substraction();
        int ans=sub.subNum(2,1);
        System.out.println(ans);
    }
}
