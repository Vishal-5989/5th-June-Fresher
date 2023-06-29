import java.util.Scanner;

//function without argument & without return type
public class Multiplication {
    public void getMultiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int input1 = sc.nextInt();
        System.out.println("Enter 2st Number");
        int input2 = sc.nextInt();

        int result = input1 * input2;
        System.out.println("Multiplication is -> " + result);
    }

    public static void main(String[] args) {
        Multiplication mul = new Multiplication();
        mul.getMultiplication();
    }
}
