public class reverse{
    public static void main(String[] args) {
        String s="My name is Rutuja";
        String word[]=s.split("\\s");
        String reverse="";

        for(int i=0;i<word.length;i++) {
            String w = word[i];
            String reverseword = "";
            for (int j =w.length()-1; j >= 0; j--) {
                reverseword = reverseword + w.charAt(j);
            }
            reverse= reverse + reverseword+ " ";
        }

        System.out.println("Reversed string : " + reverse);

        }



}
