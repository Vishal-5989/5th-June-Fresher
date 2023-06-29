public class ExceptionTryCatch {

    public static void main(String[] args) {

        try {
            try {
                int a = 85 / 0;
                System.out.println("Result: " + a);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception Occurred");
            }
            try {
                int[] b = new int[6];
                b[6] = 9;
            } catch (ArrayIndexOutOfBoundsException ai) {
                System.out.println("ArrayIndexOutOfBoundsException Occurred");
            }

        }

            catch (Exception ee) {
                System.out.println("Exception Handled");

        }
    }
}
