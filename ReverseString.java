import java.lang.String;
public class ReverseString {

    public static void main(String[] args){

        String originalstr = "Its Mona";
        String reversestr = "";

        for (int i=0; i<originalstr.length(); i++){

            reversestr =originalstr.charAt(i) +reversestr;

        }
           System.out.println("Reversed String Is:"+reversestr);

    }
}
