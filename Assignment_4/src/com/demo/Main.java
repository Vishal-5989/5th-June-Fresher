package com.demo;

import java.util.Scanner;

public class Main {
    public static void HomePage(){

        System.out.println("** Press 1 For Find Area Of Circle  **");
        System.out.println("** Press 2 For Find Count Of Digits  **");
        System.out.println("** Press 3 For Find Prime Number From 1 to 1000  **");
        System.out.println("** Press 4 For Find Count Pair in String  **");
        Scanner sc = new Scanner(System.in);{
            int input =sc.nextInt();
            switch (input) {
                case 1 :
                    AreaOfCircle.getArea();
                    break;
                case 2:
                    CountDigits.getCount();
                    break;
                case 3:
                    PrimeNumber.getPrime();
                    break;
                case 4:
                    CountPair.getCount();

            }
        }
    }
    public static void main(String[] args) {
        Main.HomePage();
    }
}
