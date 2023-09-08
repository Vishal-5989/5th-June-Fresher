import java.util.*;


public class PairOfString {
    void compare(){

        String[] strings = new String[]{
                "ab",
                "ba",
                "asd",
                "ab",
                "qwe",
                "asd"
        };
        System.out.println("Strings: \n");
        for (int i = 0; i< strings.length;i++){
            System.out.println(strings[i]);
        }

        Map<String, Integer> duplicateCountMap = new HashMap<>();

        for (int i = 0; i < strings.length; i++){
            duplicateCountMap.put((String)strings[i],
                        duplicateCountMap.getOrDefault((String)strings[i], 0) + 1);
        }

        System.out.println("\nKey as String and "+ "Value as its count : \n"+ duplicateCountMap);
    }
}
