
import java.util.HashMap;
import java.util.Map;
public class PairProgram {


    public static void getcount(){

        String[] strings=new String[]{"(Disha,Mona)", "(Ritu,Abir)", "(Shivansh,Divyansh)", "(Ritu,Abir)"};
        System.out.println(" Strings: \n");
        Map<String, Integer> dupCountMap = new HashMap<>();

        for(int i = 0; i < strings.length; i++) {
            dupCountMap.put((String) strings[i],
                    dupCountMap.getOrDefault((String) strings[i], 0) + 1);
        }
        System.out.println("\nkey as String and" + "Value as count :\n" + dupCountMap);
    }
    public static void main(String[] args){
        getcount();
    }


}
