public class buffer {

    public static void main(String[]args){

        StringBuffer s=new StringBuffer("Yogesh");

        System.out.println( s.insert(2,"RR"));
     //   System.out.println(s);

        s.reverse();
        System.out.println(s);  // to reverse the string

        s.insert(2,"RR");     //to insert string into the string


    }
}
