public class WithTryCatchBlock {
    public static void main(String[] args) {
        System.out.println("ST-1");
        try {

            System.out.println(10/0);

        } catch (ArithmeticException e)
        {
            System.out.println(10/2);
        }
        System.out.println("ST-3"); //Normal Terminations or Graceful termination


    }
}
