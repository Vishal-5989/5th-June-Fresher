package ExceptionHandling;

public class DemoException
{
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int i , j ,k=0;
        i = 8;
        j = 2;
        int [] a = new int[5];

        try
        {
            k = i/j;

            for(int c =0; c<=4;c++)
                a[c] = c + 1;
            for(int value : a)
            {
                System.out.print(value);
            }
        }
        catch (Exception e)
        {

            System.out.println("Cannot be divided by zero"+e);
        }
        System.out.println(k);
    }
}
