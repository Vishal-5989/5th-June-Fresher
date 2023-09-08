import java.util.Stack;

public class ReverseWord {
    void reverseWord(String string){

        String rev = " ";

        for(int i = 0; i<string.length(); i++){
            char c = string.charAt(i);
            rev = c + rev;
        }

        String temp[] = rev.split(" ");
        for (int j = temp.length-1; j>=0; j--){
            System.out.print(temp[j]);
            System.out.print(" ");
        }


    }
}
