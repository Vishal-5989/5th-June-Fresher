import java.util.Scanner;
// with argu , with return type
public class Subtraction {

    public int getSub(int input1 , int input2){

        int result = input1-input2;
        return result;
    }

    public static void main(String[] args) {

        Subtraction sub = new Subtraction();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int input1=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int input2=sc.nextInt();
        int result1= sub.getSub(input1,input2);

        System.out.println("Subtraction is -> "+result1);
    }
}
