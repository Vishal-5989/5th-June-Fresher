
public class StringBufferTest {

    public static void main(String[] args){

        StringBuffer sb=new StringBuffer("Hello ");
        System.out.println(sb.append("World"));
        System.out.println(sb.replace( 6,6, "Python "));
        System.out.println(sb.deleteCharAt(9));

    }
}
