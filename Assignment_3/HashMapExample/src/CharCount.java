import java.util.HashMap;
import java.util.Map;

public class CharCount {

    public void countChar(String a){
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:a.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer>l:map.entrySet()) {
            System.out.println("Character= "+l.getKey()+" "+l.getValue()+" Times");
        }
    }

    public static void main(String[] args) {
        String str="love the life you live";   //Using collection Map

        CharCount c=new CharCount();
        c.countChar(str);
    }
}
