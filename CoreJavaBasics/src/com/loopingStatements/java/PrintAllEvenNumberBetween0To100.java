package com.loopingStatements.java;

import java.util.Scanner;

public class PrintAllEvenNumberBetween0To100 {


    public void allEven()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number here : ");
        int first = sc.nextInt();
        System.out.println("enter second number here : ");
        int second = sc.nextInt();

        for(int i = first; i<=second ; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        PrintAllEvenNumberBetween0To100 obj = new PrintAllEvenNumberBetween0To100();
        obj.allEven();
    }
}
