import java.util.Scanner;
public class Functions {
    void preDefined() {

        int value1, value2;
        System.out.println("Enter thr number:");
        Scanner fnumber = new Scanner(System.in);
        value1 = fnumber.nextInt();
        System.out.println("Enter the second number:");
        Scanner snumber = new Scanner(System.in);
        value2 = snumber.nextInt();

        System.out.println("Sum of given number is "+Math.addExact(value1,value2));
        System.out.println("Subtractions of given number is "+Math.subtractExact(value1,value2));
        System.out.println("Product of given number is "+Math.multiplyExact(value1,value2));
        System.out.println("Divison of given number is "+Math.floorDiv(value1,value2));
    }

    void userDefined(int value1, int value2){

        int sum = value1 + value2;
        int Subtractions = value1 - value2;
        int product = value1 * value2;
        int Divison = value1 / value2;

        System.out.println("Sum of given number is "+ sum);
        System.out.println("Subtractions of given number is "+ Subtractions);
        System.out.println("Product of given number is "+ product);
        System.out.println("Divison of given number is "+ Divison);
    }

    int returnValue(int value1, int value2){
        int sum = value1 + value2;
        return sum;
    }

}