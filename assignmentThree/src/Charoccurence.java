import java.util.HashMap;
import java.util.Scanner;

public class Charoccurence {
    void occurence(){

        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = str.length() - 1; i >= 0; i--)
        {
            if(charCount.containsKey(str.charAt(i)))
            {
                int count = charCount.get(str.charAt(i));
                charCount.put(str.charAt(i), ++count);
            }
            else
            {
                charCount.put(str.charAt(i),1);
            }
        }
        System.out.println(charCount);
    }
}
