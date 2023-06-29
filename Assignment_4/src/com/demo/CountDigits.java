package com.demo;

import java.util.Scanner;

public class CountDigits {
    public static void getCount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        long input=sc.nextLong();

        long count=0;
        while (input!=0){
            input=input/10;
            count++;
        }
        System.out.println("Count Of Digits Is -> " +count);
        System.out.println(" ");
        Main.HomePage();
    }
}
