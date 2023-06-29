import java.sql.SQLOutput;

public class Calculator {
    //1.with i/p with o/p
    public  static double sum(int a,int b)
    {
        int add=a+b;
       return add;
    }
    //2.with i/p without o/p
    public void product(int a,int b)
    {
        System.out.println("Product of a and b is: "+(a*b));
    }
    //3.without i/p with o/p
    public static double division(){
        int a=60;
        int b=30;
        return a/b;
    }
    //without i/p without o/p
    public void subtraction(){
        int a=90;
        int b=70;
        System.out.println("Subtraction of a and b is: "+(a-b));
    }

    public static void main(String[] args) {
        Calculator c=new Calculator();

        double addition=sum(10,20);
        System.out.println("Addition of two number is: "+addition);
        c.product(30,40);
        double div=division();
        System.out.println("Division of two number"+div);
        c.subtraction();
    }
}
