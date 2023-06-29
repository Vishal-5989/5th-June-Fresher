public class ExceptionMulticatch {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[5]=50/0;
        }
        catch (ArithmeticException e){
            System.out.println("Aritmatic Exception Occurs");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception occurs");
        }
        catch (Exception e){
            System.out.println("Parent Exception occurs");
        }
        finally{
            System.out.println("Execution completed");
        }
    }
}
