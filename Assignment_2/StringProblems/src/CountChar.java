import java.util.HashSet;

public class CountChar {

    public void charCount(String str){
        String str1=str.replaceAll(" ", "");
        System.out.println(str1);
        HashSet<Integer>h=new HashSet<>();

        int []arr=new int[str1.length()];

        for (int i=0;i<str1.length()-1;i++){
            int count=0;
            for(int j=0;j<str1.length();j++){
                if (str1.charAt(i)==(str1.charAt(j))){
                    count++;
                }
               arr[i]=count;
            }

            System.out.println(str1.charAt(i)+"=="+arr[i]);
        }

    }

    public static void main(String[] args) {
        String str="love the life you live";

        CountChar c=new CountChar();    //Using for loop
        c.charCount(str);
    }
}
