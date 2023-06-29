public class FinallyBlock {
    public static void main(String[] args) {
        //case 1 -> If there is no exception
        try
        {
            System.out.println("try");// executed
        } catch (Exception e)
        {
            System.out.println("catch");
        }
        finally {
            System.out.println("finally_block");//Executed
        }

        //case 2 -> If exception raised and handled
        try
        {
            System.out.println("try"); //executed
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.println("Catch_Block"); //executed
        } finally {
            System.out.println("Finally_Block"); //executed
        }

        //If an exception raised but not handeled
        try
        {
            System.out.println("try"); //executed
            System.out.println(10/0); //abnormal termination
        } catch (NullPointerException e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally"); //compulsory finally block exwecuted
        }
    }
}
