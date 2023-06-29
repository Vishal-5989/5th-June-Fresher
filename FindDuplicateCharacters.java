import java.util.HashMap;

import java.util.Map;
import  java.util.Set;

public class FindDuplicateCharacters {
    public static void main(String[] args){
        String str = "Shubham Ravindra Choudhary";
        //convert the string into character array
        char[] chars = str.toCharArray();  //s h u b h a m . . . . .
        Map<Character,Integer> charMap = new HashMap<>();
        // Character are inserted as keys and integer are inserted as items
        // If map already contains the characters than increas the value by 1

        for(Character ch : chars){
            if(charMap.containsKey(ch)){
                charMap.put(ch,charMap.get(ch) +1);

            }
            else
            {
                charMap.put(ch, 1);
            }
        }

        // Loop throug only keys

        Set<Character> keys = charMap.keySet();

        for (Character ch : keys){
            if(charMap.get(ch)>1){
                System.out.println("Character " + ch + " repeating " +  charMap.get(ch) + " times.");
            }
        }

    }
}
