import java.util.Scanner;

public class AreaOfParameter {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius");
        int radius=sc.nextInt();

        double area=3.14*radius*radius;
        double perimeter=2*3.14*radius;

        System.out.println("Area of circle is :"+area);
        System.out.println("Parameter of circle is: "+perimeter);

    }
}
