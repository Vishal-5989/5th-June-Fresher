import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TryCatch {
    void tryCatch(){
        try {
            int x = 100/0;
            System.out.println("value= "+x);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            try {
                int y = 100 / 0;
            } catch (Exception m) {
                System.out.println(m.getMessage());
                System.out.println("This the try catch block");
            }
        }
    }
    void multilpleTryCatch(){
        try{
            int a[]=new int[5];
            a[5]=30/0; // this will print arithmetic excception
            System.out.println(a[10]); // this will print array out of bound exception
            String s = null;
            System.out.println(s.length());  // this will print parent exception
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
    void nestedTryCatch(){
        try{
            try {
                int a[]=new int[5];
                System.out.println(a[10]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
            int x = 10/0;
            System.out.println(x);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    void finallyException(){
        try {
            int x = 100/0;
            System.out.println("value= "+x);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This block is finally block it will run every time");
        }
    }
    void uncheckedException(){
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<18){
            throw new ArithmeticException("Not valid age");
        } else {
            System.out.println("You are eligible for vote");
        }
    }
    void checkedException() throws FileNotFoundException {
        FileReader file = new FileReader("C:\\Users\\Vishal\\Desktop\\abc.txt");
        BufferedReader fileInput = new BufferedReader(file);
        throw new FileNotFoundException("");
    }
    void userDefineException() throws Exception{
        try{
            throw new UserDefineException(400);
        }
        catch(UserDefineException e){
            System.out.println(e) ;
        }
    }
    void exceptionPropogation(){
        try{
            n();
        }catch(Exception e){
            System.out.println("exception handled");
        }
        System.out.println("normal flow");
    }
    void n(){
        m();
    }
    void m(){
        int data=50/0;
    }
    void throwsKeyword(){
        try{
            nn();
        }catch(Exception e){System.out.println("exception handled");}
    }
    void nn() throws IOException {
        mm();
    }
    void mm() throws IOException {
//        System.out.println("hello");
        throw new IOException("device error"); // if exception throws from here then catch block will execute
    }
    void customException(){
        try
        {
            throw new MyCustomException();
        }
        catch (MyCustomException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }
}

class UserDefineException extends Exception{
    int num1;
    UserDefineException(int num2){
        num1 = num2;
    }
    public String toString(){
        return ("Status code = "+num1) ;
    }
}
class MyCustomException extends Exception
{

}