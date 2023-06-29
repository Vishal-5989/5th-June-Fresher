
public class characterCount {
    public static void charCount(String str){
        int[] ar=new int[156];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            ar[ch]++;

        }

        for(int i=0;i< ar.length;i++){
            if(ar[i]>0){
                System.out.println((char)i +" : " +ar[i]);
            }
        }
    }
    public static void main(String[] args){
        String str="Hello,World!";
        charCount(str);

    }

}
