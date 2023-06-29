import java.util.Scanner;

public class AreaCircle {

    public static void main(String[] args)
    {
        System.out.println("1.Area of Circle\n2.Perimeter of circle");
        Scanner in = new Scanner(System.in);
        System.out.println("select choice from above");
        int n = in.nextInt();
        switch (n)
        {
            case 1:
                System.out.println("Enter radius");
                double r = in.nextInt();
                double area = 3.142 * r * r;
                System.out.println("Area of Circle : " + area);
                break;

            case 2:
                System.out.println("Enter radius");
                 r = in.nextInt();
                double perimeter = 2*3.142*r;
                System.out.println("Perimeter of Circle : "+ perimeter);
                break;
            default:
                System.out.println("Enter valid choice ");
        }

    }
}
