import java.util.Scanner;

public class AreaC {
    public static void main(String[] args) {
        System.out.println("Enter the radius");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        Double Area = 3.147*radius*radius;
        Double perimeter =2*3.147*radius;

        System.out.println("Area of circle: "+Area );
        System.out.println("Perimeter of circle: "+perimeter);
    }

}
