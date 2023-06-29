import java.sql.SQLOutput;

public class Function {

    public static int add( int a,int b){
        return a+b;
    }
    public void product(int a,int b){
        System.out.println("Product of "+a+ " and "+b +" is "+a*b);
    }
    public static int div(){
        int division = 28/4;
        return division;
    }
    public void sub(){
        System.out.println("subtraction of 25 and 13 "+ (25-13));

    }

    public static void main(String[] args) {
        Function obj = new Function();
        int sum=add(22,89);
        System.out.println("sum of 22 and 89 is "+ sum);
        obj.product(25,4);
        int as =div();
        System.out.println("Division of 28 and 4 is "+as);
        obj.sub();
    }

}
