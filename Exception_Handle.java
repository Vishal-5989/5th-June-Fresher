import java.util.Scanner;

public class Exception_Handle extends Exception{
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getMessage() {
        return "number should not be negative";
    }
}


class MyTest{


    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if (a<0){
            try {
                throw new Exception_Handle();
            }
              catch (Exception_Handle e5){
                  System.out.println(e5.getMessage());
              }



        }
    }







}