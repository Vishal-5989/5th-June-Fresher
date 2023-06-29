import java.util.Scanner;

//function without argument & with return type
public class Division {
    int result;
    public int getDiv(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dividend");
        int input1 = sc.nextInt();
        System.out.println("Enter Divisor");
        int input2 = sc.nextInt();

         result = input1 / input2;
            return result;
    }
    public static void main(String[] args) {
        Division div = new Division();
        int result = div.getDiv();

        System.out.println("Division is -> "+result);
    }
}
