import java.util.Scanner;

public class Function {
    // Functions With Arguments and without return Values
   public static void add(int a,int b)
  {
     int sum = a+b;
          System.out.println("a+b = "+sum);
   }

   // Functions With Arguments and Return Values
    public static int mul(int a,int b) {

        return (a * b);
    }
   // Functions Without Arguments and With Return Values
    public static int division()
    {
        int a = 10,b=5;
        int sum = a/b;
        return sum;
    }

    //Functions Without Arguments and Without Return Values
   public static void sub(){
      int a = 10,b=5;
       int sum = a-b;
      System.out.println("a-b= "+sum);
   }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a= sc.nextInt();
        int b = sc.nextInt();

        add(a,b);
        mul(a,b);
       int res =  division();
        System.out.println("a/b = "+res);
        sub();

    }
}
