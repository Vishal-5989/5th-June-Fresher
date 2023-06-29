public class ThrowKeywordCaseOne {

//    static ArithmeticException e = new ArithmeticException();
    static ArithmeticException e1;

    public static void main(String[] args) {
       // throw e;//Arithmetic Exception
        throw e1;// NullPointerException
    }
}
