package com.demo.test;
import java.util.Scanner;

public class Solution {
    public void primeCheck(int num){
        int temp=1;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    temp=0;
                    break;
                }
            }if(temp==1){
                System.out.println(" "+num);
            }
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        for(int i=2;i<=1000;i++){
            s.primeCheck(i);
        }
    }
}
