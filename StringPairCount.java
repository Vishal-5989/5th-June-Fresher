import java.util.HashMap;
import java.util.Map;

public class StringPairCount {
    public static void getCount(){
        String[] strings=new String[]{"(AB,BC)","(BC,CD)","(CD,AB)","(AB,BC)"};
        Map<String , Integer> dupCountMap=new HashMap<>();

        for (int i=0; i<strings.length; i++){
            dupCountMap.put((String)strings[i],
                    dupCountMap.getOrDefault((String) strings[i],0) +1);
        }
        System.out.println("\nkey as String and" + "Value as Count :\n" +dupCountMap);

        }
        public static void main(String[] args){
        getCount();
    }
}
