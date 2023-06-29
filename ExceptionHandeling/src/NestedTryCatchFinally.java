public class NestedTryCatchFinally {
    public static void main(String[] args) {
//        try
//        {
//            System.out.println("Outer try block");// executed
//            try
//            {
//                System.out.println("Inner try block");//executed
//                System.out.println(10/0);
//            } catch (ArithmeticException e) {
//                System.out.println("Inner catch block");//executed
//            }
//        } catch (Exception e) {
//            System.out.println("Outer catch block");//skip because exception already handeled
//        } finally {
//            System.out.println("Finally block");//executed
//        }

        test();
    }

    public static void test() {
        try
        {
            System.out.println("Outer try block");
            try
            {
                System.out.println("Inner try block");
                System.out.println(10/0);
            } catch(NullPointerException e) {
                System.out.println("Inner catch block");
            }
            System.out.println("Outside of inner catch block");
        } catch (ArithmeticException e) {
            System.out.println("Outer catch block ");
        } finally {
            System.out.println("Outer finally block");
        }
    }
}
