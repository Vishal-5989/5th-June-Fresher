import java.util.HashMap;
import java.util.Map;

public class AlphabetPairCount {
    public static void main(String[] args) {
        String str1 = "abcdegfnhfhm";
        String str2 = "defghfhgfnhjygfyh";

        int pairCount = countAlphabetPairs(str1, str2);
        System.out.println("Alphabet Pair Count: " + pairCount);
    }

    public static int countAlphabetPairs(String str1, String str2) {
        Map<Character, Integer> countMap = new HashMap<>();

        // Count the frequency of each character in the first string
        for (char ch : str1.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        int pairCount = 0;
        // Check the frequency of each character in the second string and update the pair count
        for (char ch : str2.toCharArray()) {
            if (countMap.containsKey(ch) && countMap.get(ch) > 0) {
                pairCount++;
                countMap.put(ch, countMap.get(ch) - 1);
            }
        }

        return pairCount;
    }
}
