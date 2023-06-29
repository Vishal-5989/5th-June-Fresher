public class Exception1 {

    public static void main(String[] args){
        try {
            int[] myNumber ={1,2,3};
            System.out.println(myNumber[10]);
        }catch (Exception a){
            System.out.println("Something went wrong");
        }
    }
}
