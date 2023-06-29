import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void getException(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int input1=sc.nextInt();
        System.out.println("Enter 2st Number");
        int input2=sc.nextInt();

        try {
            int result = input1 / input2;
            System.out.println(result);

            if(input2==0){
                throw new CustomException("2nd Number not be Zero");


            }

        }
        catch (ArithmeticException e){
                   System.out.println("This is ArithmeticException -> " +e.getMessage());
                     System.out.println("2st Number can not be Zero");
        }

        catch (InputMismatchException e){

            System.out.println("Invalid Number" +e.getMessage());
        }
        catch (Exception e){
            System.out.println("Error" +e.getMessage());
        }
        finally {
            System.out.println("This is Finally Block");
        }

    }
    public static void getExceptionn(){

        int arr[  ] = { 1, 2, 3, 4, 5 };


        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of Array");
            int input =sc.nextInt();
            System.out.println(arr[input]);


        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }

    }
}





