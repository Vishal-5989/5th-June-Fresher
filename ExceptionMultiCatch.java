public class ExceptionMultiCatch {
    public static void main(String[] args){

        try {
            int a[]=new int[5];
            a[5]=40/0;
        }
        catch (ArithmeticException e){
            System.out.println("Arithmatic Exception Occure");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occure");
        }
        catch (Exception e){
            System.out.println("Parent Exception Occure");
        }
        finally {
            System.out.println("Execution Completed");
        }

    }
}
