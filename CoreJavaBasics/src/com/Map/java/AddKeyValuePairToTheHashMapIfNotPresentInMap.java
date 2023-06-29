package com.Map.java;

import java.util.HashMap;

public class AddKeyValuePairToTheHashMapIfNotPresentInMap {
    public static void main(String[] args) {
        HashMap h = new HashMap();
        h.put(1, "One");
        h.put(2, "Two");
        h.put(3, "Three");
        h.put(4, "four");
        System.out.println(h);
        h.putIfAbsent(6, "Six");
        h.putIfAbsent(5, "Five");
        System.out.println(h);
    }
}
