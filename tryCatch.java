public class tryCatch {
    public static void main(String[] args) {
        try{
            int number=10/5;
            System.out.println(number);
            try {
                int arr[] = {1, 2, 3, 4, 5};
                System.out.println(arr[6]);

                try {
                    String s = null;
                    System.out.println(s.toLowerCase());
                }
                catch (NullPointerException e) {
                    System.out.println("Generate null pointer exception.");
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Please give correct index for array.");
            }
        }
        catch (ArithmeticException e){
            System.out.println("Number divide by zero is not possible.");
        }
    }
}
