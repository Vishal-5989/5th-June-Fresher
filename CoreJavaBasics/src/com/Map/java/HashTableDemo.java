package com.Map.java;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable h = new Hashtable();
        h.put(new TempHashtable(5), "A");
        h.put(new TempHashtable(2), "B");
        h.put(new TempHashtable(6), "C");
        h.put(new TempHashtable(15), "D");
        h.put(new TempHashtable(23), "E");
        h.put(new TempHashtable(16), "F");
        //We can not add null it will gets Null Pointer exception
        System.out.println(h);


    }
}
