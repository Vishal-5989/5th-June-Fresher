import java.util.Scanner;

public class AreaofCircle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int r = sc.nextInt();
        double area = 3.14 * r * r;
        System.out.println("Area of circle: "+area);

    }
}
