public class exceptionexample {
    public static void main(String[] args) {
        try
        {
            int d= 50/0;

        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of code");
    }
}
