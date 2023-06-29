public class ExceptionTest1 {

    void div(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        else{
            int c=a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args){

        ExceptionTest1 t=new ExceptionTest1();
        try{
            t.div(40,0);
        }
        catch(Exception e){
            System.out.println("The value of b is zero");
        }

    }


}
