package com.demo;

import java.util.HashMap;
import java.util.Map;
public class CountPair {
    public static void getCount(){
        String[] strings = new String[]{"ab", "ba", "as", "ab", "xy", "as"};

            for (int i=0;i< strings.length;i++){
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

