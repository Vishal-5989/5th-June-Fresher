import java.awt.geom.Area;
import java.util.Scanner;

public class Area_Perimeter {

    public static void main(String[] args) {
        System.out.println("Enter the radius of circle");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();


        double are=Area(r);
       double per=Perimeter(r);

        System.out.println("Area of circle is "+are);
        System.out.println("Perimeter of circle is "+per);

    }

    public static double Area(int r ){

        double area= Math.PI*(Math.pow(r,2));

        return area;
    }
    public static double Perimeter(int r ){
        double perimeter=2*Math.PI*r;
        return perimeter;
    }
}
