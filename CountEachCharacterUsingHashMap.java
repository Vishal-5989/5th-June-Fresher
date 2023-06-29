import java.util.HashMap;
import java.util.Map;

public class CountEachCharacterUsingHashMap {
    public static void main(String[] args) {
        String str = "Shubham Ravindra Choudhary";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // Ignore non-alphabetic characters
            if (Character.isLetter(ch)) {
                // Update the count in the HashMap
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Print the character count
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
