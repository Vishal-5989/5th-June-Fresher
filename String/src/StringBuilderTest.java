

public class StringBuilderTest {

    public static void main(String[] args){

        StringBuilder sbl=new StringBuilder("Java");
        System.out.println(sbl.append("Programming"));
        System.out.println(sbl.reverse());
        int length= sbl.length();
        System.out.println(" Length of String : " +length);
    }


}
