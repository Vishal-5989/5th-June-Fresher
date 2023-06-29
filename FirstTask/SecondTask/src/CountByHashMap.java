import java.util.HashMap;
import java.util.Map;

public class CountByHashMap {

    public static void charCount(String str)
    {
        HashMap<Character,Integer> charCountMap = new HashMap<>();

        char[] strArray = str.toCharArray();

        for(char c : strArray)
        {
            if(charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
                else
                {
                    charCountMap.put(c,1);
                }
        }
        for(Map.Entry entry : charCountMap.entrySet())
        {
            System.out.println(entry.getKey()+ "="+entry.getValue());
        }
    }
    public static void main(String[] args)
    {
        String s = "Welcome";
        charCount(s);
    }
}
