 class Exception_Handling {

     public static void main(String[] args) {

         try {
             System.out.println("Inside fisrt try block");
             try {

                 int a = 5, b = 0;
                 int c = a / b;
             } catch (ArithmeticException e) {
                 System.out.println("Cant divide number by 0");
             }
             try {
                 String[] str = new String[5];
                 str[6] = "Yogesh";

             } catch (Exception e1) {
                 // System.out.println(e1);
                 System.out.println(e1 + "above is the exception ");
             }
             try {
                 String str = "Yogesh";
                 System.out.println(str.charAt(7));
             } catch (StringIndexOutOfBoundsException s) {
                 System.out.println("Given index does not exist in the string");
             }

         }


catch (Exception e3){
    System.out.println("Exxceptionare handled");
}
         System.out.println("If any expection occured all are handled ");


    }


}


