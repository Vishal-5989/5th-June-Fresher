package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.demo.exceptions.WrongOpratorException;

public class TestCalculator {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("*********Calculator*********");
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        System.out.println("select Operator from list ['+','-','*','/','%']");
        String op = sc.next();

        try {
            calculate(num1, num2, op);
        } catch (WrongOpratorException e) {

            e.getMessage();
        }


    }

    public static void calculate(int num1, int num2, String operator) throws WrongOpratorException
    {

        switch(operator)
        {
            case "+":
                int sum = num1 + num2;
                System.out.println(sum);
                break;

            case "-":
                int sub = num1 - num2;
                System.out.println(sub);
                break;

            case "*":
                int mul = num1 * num2;
                System.out.println(mul);
                break;

            case "/":
                int div = num1/num2;
                System.out.println(div);
                break;

            case "%":
                int mod = num1%num2;
                System.out.println(mod);
                break;

            default:
                throw new WrongOpratorException ("Enter the Correct Operator from list");
        }

    }

}
