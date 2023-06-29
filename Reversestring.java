public class Reversestring {
    public static void main(String[] args) {
        String str="Hello Everyone out there";
        String result="";

        for (int i=str.length()-1;i>=0;i--)
            result+=str.charAt(i);
        System.out.println(result);
    }
}
