public class WordReverse {
    public String reverseWord(String s){

        String [] str=s.split(" ");     //String to array
        StringBuilder sb=new StringBuilder();  //StringBuffer for string mutable
        int i=0;
        int j=str.length-1;
        for(i=0;i<=j;i++){
            StringBuilder sb2=new StringBuilder();   //StringBuffer
            for(int k=str[i].length()-1;k>=0;k--){
                sb2.append(str[i].charAt(k));
            }
            sb.append(sb2);
            sb.append(" ");                 //append the "" after the completed function
        }
        //System.out.println(j);
        return sb.toString().trim();        // Remove the ""
    }

    public static void main(String[] args) {
        WordReverse reverse=new WordReverse();
        String str="love the life you live";
        System.out.println("original string :"+str);
        String a=reverse.reverseWord(str);  //call the function
        System.out.println("Reverse String of Words!!");
        for (int i=0;i<a.length();i++){
            System.out.print(a.charAt(i));  //print the reverse words in string
        }

    }
}
