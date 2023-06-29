package com.demo;

public class PrimeNumber {

    public static void getPrime() {

        for (int i = 1; i <= 1000; i++) {
            int temp = 0;
            for (int j=2;j<=i-1;j++){
                if(i%j==0){
                    temp=temp+1;
                }
            }
            if (temp==0){
                System.out.println(i +" Number Is prime");
            }
        }
        System.out.println(" ");
        Main.HomePage();
    }
}