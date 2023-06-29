public class Functions {
        //Parametarised Function
    public static int add(int a, int b){
        int sum=a+b;
        int sum1=sum;
        System.out.println("Addition of Two Numbers" +sum1);
        return sum1;

    }
    //Non-parametarised Function
    public static void multiplication(){
        int a = 10;
        int b = 20;
        int m =a*b;
        System.out.println("Multiplication of Two Numbers are:" +m);

    }

    //Without return type
    public static void subtraction(){
        int a = 20;
        int b = 30;
        int s = a-b;
        System.out.println("Subtraction of two numbers:" +s);
    }

    //with return type
    public static void division(){
        int a=40, b=20;
        System.out.println("Division of two numbers:" +(a/b));
        return;
    }

    public static void main(String[] args){
        add(40,20);
        multiplication();
        subtraction();
        division();
    }
}
