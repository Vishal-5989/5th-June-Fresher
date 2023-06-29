public class Functions {

    public static int add(int x , int y)
    {

        int sum = x+y;
        int s=sum;
        System.out.println("Addition of two numbers   " +s);
        return s;
    }

    public static  void multiplication(){
        int a= 10;
        int b= 20;
        int m =a*b;
        System.out.println("Multiplication of two numbers "+m);

    }
    public static void subtraction(){
        int a=190;
        int b=10;
        int s=a-b;
        System.out.println(" Subtraction of two numbers " +s);

    }
    public static void division( int a, int b){

        System.out.println("Division of two numbers "+(a/b));
        return;
    }

    public static void main(String[] args){


        add( 10,20);
        multiplication();
        subtraction();
        division(80,40);
    }

}
