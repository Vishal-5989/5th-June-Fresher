import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int radius=sc.nextInt();
        System.out.println("Area of Circle is");
        area(radius);

        System.out.println("Perimeter of circle is");
        perimeter(radius );

    }
    public static void area(int radius){
        double areaOfCircle=3.14*radius*radius;
        System.out.println(areaOfCircle);
    }
    public static void perimeter(int radius){
        double perimeterOfCircle=3.14*2*radius;
        System.out.println(perimeterOfCircle);
    }
}
