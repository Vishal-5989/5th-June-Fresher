
public class StringBuildertest{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.append("Java"));
        System.out.println(sb.append("Language"));

        int length= sb.length();
        System.out.println(" Length of String : " +length);


    }
}