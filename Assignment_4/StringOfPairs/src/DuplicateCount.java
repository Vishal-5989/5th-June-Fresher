import java.util.HashMap;
import java.util.Map;

public class DuplicateCount {

    public static void main(String[] args) {
        String[] array = {"aa", "ba", "aa", "ba", "aa", "ca"};
        Map<String, Integer> map = countCommon(array);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
        }

    }
    public static Map<String, Integer> countCommon(String[] array) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : array) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        return map;
    }
}
