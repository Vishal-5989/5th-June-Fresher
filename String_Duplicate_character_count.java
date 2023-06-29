public class String_Duplicate_character_count {
    public static void main(String[] args) {
        String str="yyhogeeesh xxu uiip";
        char ch[]= str.toCharArray();

        for (int  i=0;i<ch.length;i++){
            int count=0;
            for (int j=i+1;j<ch.length;j++){

                if (ch[i]==ch[j]){
                    count++;

                }

            }
            if (count>=1){
                int finalcount=count+1;
                System.out.println(ch[i]+" appered "+ finalcount+" times");
           }
        }

    }
}
