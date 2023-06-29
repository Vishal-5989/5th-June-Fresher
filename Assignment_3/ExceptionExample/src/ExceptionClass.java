import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionClass {
    public void exception_1(){
        try{
            int data=100/0;             //code that may raise exception
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("ArithmeticException handled ");
    }

    public void exeception_2(){
        try
        {
            int arr[]= {1,3,5,7};
            System.out.println(arr[10]); //may throw exception
        }
        // handling the array exception
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("ArrayIndexOutOfBoundsException handled");
    }

    public void exeception_3(){
        PrintWriter pw;
        try {
            pw = new PrintWriter("jtp.txt"); //may throw exception
            pw.println("saved");
        }
                                                    // providing the checked exception handler
        catch (FileNotFoundException e) {           //checked exception

            System.out.println(e);
        }
        System.out.println("File saved successfully");
    }

    public void exception_4(){       //multiple catch block
        try{
            int a[]=new int[5];
            a[5]=30/0;
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
        System.out.println("rest of the code");
    }

    public void exception_5(){
        try{
            int data=100/0;             //code that may raise exception
        }catch(ArithmeticException e){

            System.out.println(e);
            try{
                int data=50/0;             //code that may raise exception
            }catch(ArithmeticException e1){

                System.out.println(e);
            }
        }
        System.out.println("catch block again try and catch block ");
    }
    public void exception_6(){
        // outer (main) try block
        try {

            //inner try block 1
            try {

                // inner try block 2
                try {
                    int arr[] = { 1, 2, 3, 4 };

                    //printing the array element out of its bounds
                    System.out.println(arr[10]);
                }

                // to handles ArithmeticException
                catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception");
                    System.out.println(" inner try block 2");
                }
            }

            // to handle ArithmeticException
            catch (ArithmeticException e) {
                System.out.println("Arithmetic exception");
                System.out.println("inner try block 1");
            }
        }

        // to handle ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e4) {
            System.out.print(e4);
            System.out.println(" outer (main) try block");
        }
        catch (Exception e5) {
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }
    }
    public void exception_7(){
        try{
                                //below code do not throw any exception
            int data=25/5;
            System.out.println(data);
        }
                                //catch won't be executed
        catch(NullPointerException e){
            System.out.println(e);
        }
                                //executed regardless of exception occurred or not
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of phe code...");
    }
}






