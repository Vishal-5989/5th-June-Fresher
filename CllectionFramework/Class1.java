package CllectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Class1 {
    public static void main(String[] args) {
        Map<Integer,String> mp=new TreeMap<>();
       mp.put(1,"suraj");
       mp.put(2,"Shreyash");
       mp.put(1,"Vijay");
        System.out.println(mp.get(1));
        System.out.println(mp.get(2));
    }
}
