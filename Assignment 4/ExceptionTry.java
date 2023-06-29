import java.lang.reflect.Array;

public class ExceptionTry {


    public static void main(String[] args){
        try {
            try {
                int r = 40 / 0;
                System.out.println(" Result :" + r);
            } catch (ArithmeticException ae) {
                System.out.println("Arithmetic Exception Occurred");
            }
            try {
                int[] a = new int[4];
                a[4] = 5;

            } catch (ArrayIndexOutOfBoundsException ar) {
                System.out.println("ArrayIndexOutOfBound Exception occurred");
            }

        }
             catch (java.lang.Exception e) {
                 System.out.println(" Exception Handled");

             }

    }
}
