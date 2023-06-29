import java.util.Scanner;

public class perinareaofcircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input the radius of circle :");
        double radius= sc.nextDouble();
        System.out.println("Perimeter is : "+(2* radius * Math.PI));
        System.out.println("Area is : "+(Math.PI*radius*radius));
    }
}
