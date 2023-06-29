import java.util.HashMap;
import java.util.Scanner;


public class CharacterCount {
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the String: ");
            String s=sc.nextLine();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                Character ch = s.charAt(i);

                if (ch != ' ') {

                    if (map.containsKey(ch)) {
                        int count = map.get(ch);
                        map.put(ch, count + 1);
                    } else {
                        map.put(ch, 1);
                    }
                }

            }

            System.out.println("Given string = " + s);

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ' ' && map.get(s.charAt(i)) != -1) {
                    System.out.println(s.charAt(i) + " - " + map.get(s.charAt(i)));
                    map.put(s.charAt(i), -1);
                }
            }
        }
    }
}


