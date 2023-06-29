public class ExceptionThrow {

    void div(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        else {
            int c=a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args){

        ExceptionThrow t=new ExceptionThrow();
        try{
            t.div(40,20);
        }
        catch (java.lang.Exception e){
            System.out.println("The value of b is zero");
        }
    }
}
