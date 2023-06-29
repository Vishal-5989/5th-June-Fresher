public class builder {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("Yogesh");
        s.reverse();
        System.out.println(s);   //reversing the string

        s.replace(1,3,"RR");      //replacing the string
        System.out.println(s);
        StringBuilder s1=new StringBuilder("Hadpad");

        System.out.println(s.compareTo(s1));              //compareto


        s1.deleteCharAt(3);   // deleting chracter at the particular index
        System.out.println(s1);
    }
}
