import java.util.Scanner;

public class AreaAndPerimiterOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter radius here : ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double pie = 3.14;
        double Area = radius*radius*pie;
        System.out.println("Area of the given "+radius+" is : "+Area);
        double peri = 2 * pie * radius;
        System.out.println("Perimeter of the circle for the radius "+radius+" is : "+peri);
    }
}
