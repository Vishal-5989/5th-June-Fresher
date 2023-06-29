public class CustomException extends Exception {

    CustomException() {
        System.out.println("Invalid Number");
    }
    CustomException(String number) {
         super(number);
    }
}
