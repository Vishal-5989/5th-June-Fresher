package com.loopingStatements.java;

import java.util.Scanner;

public class countThedigitPresentInTheInteger {

    public static void main(String[] args) {
        System.out.print("enter the number here : ");
        Scanner sc= new Scanner(System.in);//12345
        int num = sc.nextInt();
        int count = 0;//1, 2, 3, 4, 5


        while(num > 0)//12345>0 = true, 1234 > 0 = true, 123 > 0 = true, 12 > 0 = true, 1 > 0 = true, 0 > 0 = false
        {

            num = num / 10;//12345 / 10 = 1234, 1234 /10 = 123, 123 / 10 = 12, 12 / 10 = 1, 1/10 = 0
            ++count;//1, 2, 3, 4, 5
        }
        System.out.println(count);//5


    }

}
