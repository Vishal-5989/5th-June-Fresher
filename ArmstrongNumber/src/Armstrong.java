import java.util.Scanner;
public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reminder;
        int cubeSum = 0;
        System.out.print("Enter any 3 digit Number ");
        int number = sc.nextInt();
        int num = number;
        while (num > 0)
        {
            reminder = num % 10;
            cubeSum = cubeSum + (reminder * reminder * reminder);
            num = num / 10;
        }
        if (number == cubeSum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
    }
}