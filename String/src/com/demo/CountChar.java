package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {

    public static void getCount(String input){
        String str = input;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            // if the map already contains char, then increase the value by 1
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else { // else put the char into a map for the first time and add value of 1 as the number of occurrences
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Any String ");
        String input = sc.nextLine();
        CountChar.getCount(input);

    }
}

