import java.util.Scanner;

 class AreaandPerimeterofCircle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        double radius = scanner.nextDouble();


        double area =  Math.PI * radius * radius;
        System.out.println("area of the circle : " + area);

        double perimeter = 2 * Math.PI * radius;
        System.out.println("perimeter of the circle : " + perimeter);

        scanner.close();

    }
}
