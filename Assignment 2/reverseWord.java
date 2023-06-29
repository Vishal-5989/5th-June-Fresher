import java.lang.String;
public class reverseWord {
    public static void main(String[] args){
        String str="My Name is Jyoti";
        String[] words=str.split( " ");
        String rstring=" ";
        for(String w:words){

            String rwords=" ";
            for(int i=w.length()-1;i>=0;i--){
                rwords =rwords+w.charAt(i);

            }
            rstring= rstring+rwords +"  ";
        }

        System.out.println(rstring);
    }
}
