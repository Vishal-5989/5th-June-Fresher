import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        //Area = length * breadth
        //Parameter = 2 * (length + breadth)

        Scanner scanner = new Scanner(System.in);

        int length = 0;
        int breadth = 0;
        int area = 0;
        int parameter = 0;
        System.out.println("Enter the length of the Rectangle:");
        length = scanner.nextInt();

        System.out.println("Enter the breadth of the Rectangle:");
        breadth = scanner.nextInt();


        area = length * breadth;
        parameter = 2 * (length + breadth);

        System.out.println("The Area of Rectangle is : "+area);
        System.out.println("The area of Parameter of Rectangle is :" +parameter);


    }
}
