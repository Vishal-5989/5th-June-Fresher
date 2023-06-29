
import java.lang.String;
public class ReverseString
{
    public static void main(String[] args)
    {
        String orignalstr = "My name is Disha";
        String reversedstr = "";

        for (int i =0; i<orignalstr.length(); i++)
        {
            reversedstr = orignalstr.charAt(i) + reversedstr;
        }
        System.out.println("Reversed String is:"+reversedstr);
    }
}
