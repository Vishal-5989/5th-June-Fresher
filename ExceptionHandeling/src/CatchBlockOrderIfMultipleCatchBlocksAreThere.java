public class CatchBlockOrderIfMultipleCatchBlocksAreThere {
    public static void main(String[] args) {
        try
        {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");//first child
        } catch (Exception e) {
            System.out.println("Exception");//second parent
        }
    }
}
