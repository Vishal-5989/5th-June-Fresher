public class Countchar {
    public static void main(String[] args) {
        String str = "Hello,world!";
        countOccurrences(str);
    }

    public static void countOccurrences(String str) {
        int[] count = new int[256];

        for(int i =0;i< str.length();i++){
            char ch =str.charAt(i);
            count[ch]++;
        }
        System.out.println("Character\t Occurrences");
        for(int i=0;i< count.length;i++){
            if (count[i]!=0){
                System.out.println((char)i + "\t\t "+ count[i]);
            }
        }
    }
}
