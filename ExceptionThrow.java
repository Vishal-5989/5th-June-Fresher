
import java.lang.Exception;
public class ExceptionThrow {

    public static void validate(int age)throws Exception {
        if (age < 21) {
            throw new ArithmeticException("Person is not eligible for marriage");
        }

        else{
                System.out.println("Person is  eligible for marriage");
            }
        }
        public static void main (String[] args) {
          try {
              validate(3);

          }
          catch(Exception ae){
              System.out.println("Exception caught");
          }
        }
    }

