import java.util.Scanner;

public class AreaandPerimeter {
    void value(){
        System.out.println("Enter the radius: ");
        double x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        AreaandPerimeter a = new AreaandPerimeter();
        double area = a.area(x);
        System.out.println("Area: "+ area);
        double perimeter = a.perimeter(x);
        System.out.println("Perimeter: "+perimeter);
    }

    double area(double r){
        double total, pi = 3.14;
        total = pi * Math.sqrt(r);
        return total;
    }
    double perimeter(double r){
        double total, pi = 3.14;
        total = 2 * pi * r;
        return total;
    }
}
