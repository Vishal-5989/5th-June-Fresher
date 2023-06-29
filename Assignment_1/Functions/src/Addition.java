import java.util.Scanner;

public class Addition {
    public void addNum(int num1,int num2){
        int ans=num1+num2;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        System.out.println("The given example of take input but no return type i.e method is void  ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number!!");
        int n1=sc.nextInt();
        System.out.println("ENter the second number!!");
        int n2=sc.nextInt();
        Addition add=new Addition();
        add.addNum(1,2);
    }
}
