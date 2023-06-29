
public class StringBufferTest{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println(sb.append("Jyoti"));
        System.out.println(sb.replace(5,5, "  "));
        System.out.println(sb.deleteCharAt(3));



    }
}
