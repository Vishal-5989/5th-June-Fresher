package com.Map.java;

import java.util.TreeMap;

public class TreeMapProgram1 {
    public static void main(String[] args) {
        TreeMap t = new TreeMap();//default natural sorting order
        t.put(1, 100);
        t.put(2, 200);
        t.put(3, 300);
        t.put(4, 400);
        t.put(5, 500);
        System.out.println(t);
        //t.put("Pradip", 678);// class cast exception
       // t.put(null, 600); // null pointer exception
        t.put(6, null);
        System.out.println(t);

        TreeMap t1 = new TreeMap(new MyComparator());
        t1.put("aaa", 10);
        t1.put("bbb", 20);
        t1.put("ccc", 30);
        t1.put("ddd", 40);
        t1.put("eee", 50);
        System.out.println(t1);

    }
}
