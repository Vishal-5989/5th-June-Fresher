package com.Map.java;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class DifferenceBetweenHashMapAndIdentityHashMap {
    public static void main(String[] args) {
        //HashMap
        HashMap m = new HashMap();
        Integer t1 = new Integer(10);
        Integer t2 = new Integer(10);
        m.put(t1, "Pradip");
        m.put(t2, "Khandare");
        System.out.println(m);//{10 = Khandare}-> JVM using .equals() means content comparison

        IdentityHashMap id = new IdentityHashMap();
        Integer t3 = new Integer(20);
        Integer t4 = new Integer(20);
        id.put(t3,"Golu");
        id.put(t4, "Om");
        System.out.println(id);//{20=Golu, 20=Om} -> JVM using == operator means reference comparison
    }
}
