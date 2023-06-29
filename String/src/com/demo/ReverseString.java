package com.demo;
import java.util.Scanner;
public class ReverseString {
    public static void getrevString(String input) {
        String rev = " ";
        for (int i = 0; i <input.length(); i++) {
            char ch = input.charAt(i);
            rev = ch + rev;
        }
        String temp[] = rev.split(" ");
        for(int j=temp.length-1; j>=0;j--){
            System.out.print(temp[j]);
            System.out.print(" ");
        }
      //  System.out.println(rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Any String ");
        String input = sc.nextLine();
        ReverseString.getrevString(input);
    }
}
