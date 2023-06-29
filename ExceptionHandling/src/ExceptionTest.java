public class ExceptionTest {

    //Nested try

    public static void main(String[] args){

        String str=null;
        try{
            try{

                int r=40/0;
                System.out.println(" Result :" +r);
            }
            catch(ArithmeticException ae){
                System.out.println(" Arithmetic Exception occurred " );
            }
            try{
                int[] a=new int[4];
                a[4]=5;
            }
            catch(ArrayIndexOutOfBoundsException ar){
                System.out.println(" ArrayIndexOutOfBound Exception occurred " );
            }
            try{
                if(str.equals("ANd")){
                    System.out.println(" It is same");
                }
                else{
                    System.out.println(" Is not same");
                }
            }
            catch(NullPointerException ne){
                System.out.println(" Null Pointer Exception occurred ");
            }

        }
        catch(Exception e){
            System.out.println(" Exception Handled ");
        }
    }
}
