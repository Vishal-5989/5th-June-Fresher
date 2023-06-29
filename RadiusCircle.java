import java.util.Scanner;

public class RadiusCircle {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the Radius of Circle: ");

        double radius = sc.nextDouble();

        System.out.println( " The Perimeter is :"+(2*Math.PI*radius));
        System.out.println( " The area is :"+(Math.PI*radius*radius));
    }
}
