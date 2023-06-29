public class CharCount2 {
    public static void main(String[] args){
        String str = "Java Is Fun";
        countOccurrence(str);
    }
    public static void
              countOccurrence(String str){
        int[] count = new int[256];

        for (int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            count[ch]++;
        }
        for (int i=0; i<count.length;i++ ){
            if (count[i]!=0){
                System.out.println((char)i + ":"+count[i]);
            }
        }
    }
}
