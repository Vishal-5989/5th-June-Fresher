public class ReverseEachWords {
    public static void main(String[] args) {
        String str = "Shubham Ravindra Choudhary";
        String[] words = str.split(" "); //[Shubham, Ravindra, Choudhary]
        String revString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String revWord = reverseWord(word);
            revString += revWord + " ";
        }

        System.out.println("Original string: " + str);
        System.out.println("String with reversed words: " + revString.trim());
    }

    public static String reverseWord(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }
}
