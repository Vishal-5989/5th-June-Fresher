public class DemoException {
    public static void main(String[] args) {
        int i=8, j=3, k=0;

        int a[] = new int[4];
        try {
            k = i / j;
            for (int c = 0; c <= 4; c++) {
                a[c] = c + 1;
            }
            for (int value : a) {
                System.out.println(value);
            }
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            if (e instanceof ArithmeticException){
                System.out.println("Can not divided by zero" + e);
            }else if(e instanceof ArrayIndexOutOfBoundsException){
                System.out.println("Maximum number of value is 4");
            }
        }

        System.out.println(k);
    }
}
