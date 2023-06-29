

public class FourFunctions {

    //parameterised function

    public static int add(int a , int b){

        int sum = a+b;
        int sum1=sum;
        System.out.println(" Addition of two numbers " +sum1);
        return sum1;
    }
     //non parametrised
    public static void multiplication(){
         int a= 10;
         int b= 20;
         int m =a*b;
         System.out.println(" Multiplication of two numbers  "+m);

    }
   // without return type
    public static void subtraction(){
        int a=10;
        int b=20;
        int s=a-b;
        System.out.println(" Subtraction of two numbers " +s);

    }
    // with return type
    public static void division( int a , int b){

        System.out.println(" Division of two numbers "+(a/b));
        return;

    }

    public static void main(String[] args){


        add( 10 , 20);
        multiplication();
        subtraction();
        division(40,20);


    }
}
