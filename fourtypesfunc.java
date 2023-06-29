public class fourtypesfunc {
    public static int summation(int a, int b)
    {
//With input with output
        int sum = a + b;
        return sum;

    }

    public static void substraction(int x, int y)
    {
//with input without output
        int sub = x - y;
        System.out.println("Substraction is : "+sub);

    }

    public static String multiplication()
    {
//Without input with output
        int a = 100;
        int b = 20;
        int product = a * b;
        return "Product is "+product;

    }

    public static void division()
    {
//without input without output
        int a = 1897;
        int b = 12;
        System.out.println("Division is : "+ a/b);

    }

    public static void main(String[] args) {
        int sum = summation(12, 56);
        System.out.println("Summation is : "+ sum);
        substraction(100, 60);
        String product = multiplication();
        System.out.println(product);
        division();
    }
}
