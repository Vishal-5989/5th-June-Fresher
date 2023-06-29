package com.Map.java;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();//default capacity = 16
        hm.put(101, "A");
        hm.put(102, "B");
        hm.put(103, "C");
        System.out.println(hm);

        HashMap<Integer, Character> hm1 = new HashMap<>();
        hm1.put(1, 'a');
        hm1.put(2, 'b');
        hm1.put(3, 'c');

        System.out.println(hm1);

        hm.putAll(hm1);
        System.out.println(hm);

        System.out.println(hm.get(1));
        System.out.println(hm.size());
        System.out.println(hm.remove(1));
        System.out.println(hm.containsKey(101));
        System.out.println(hm.containsValue('a'));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());

    }
}
