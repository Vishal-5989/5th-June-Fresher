package com.Map.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AddingKeyValuePairsToHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<>();
        h.put("one", 1);
        h.put("two", 2);
        h.put("three", 3);
        h.put("four", 4);
        h.put("five", 5);
        System.out.println(h);

        Set<Map.Entry<String, Integer>> entrySet = h.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        HashMap anotherMap = new HashMap<>();
        anotherMap.put(100, "Pradip");
        anotherMap.put(200, "Khandare");
        anotherMap.put(300, "Shubham");
        anotherMap.put(400, "Bhushan");
        anotherMap.put(500, "Vijay");
        System.out.println(anotherMap);
        anotherMap.putAll(h);
        System.out.println("after adding first map into the second map : "+anotherMap);

        entrySet = anotherMap.entrySet();
        for(Map.Entry entry : entrySet)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
