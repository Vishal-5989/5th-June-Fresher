import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String name = "Pradip Khandare";
        int count = 0;
        char ch;
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < name.length(); i++) {
            ch = name.charAt(i);
            if (hashMap.containsKey(ch)) {
                count = hashMap.get(ch);
                count++;
                hashMap.replace(ch, count);
            } else {
                hashMap.put(ch, 1);
            }
        }


        for (Character key : hashMap.keySet()) {
            System.out.println(key + " = " + hashMap.get(key));
        }

    }
}


