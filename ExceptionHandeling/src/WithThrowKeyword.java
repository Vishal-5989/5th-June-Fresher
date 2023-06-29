public class WithThrowKeyword {
    public static void main(String[] args) {
       throw/*Handover our created exception object manually*/ new ArithmeticException("/ by zero expilcitely");//creation of exception object explicitely
    }
}
