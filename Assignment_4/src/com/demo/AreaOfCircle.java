package com.demo;

import java.util.Scanner;

public class AreaOfCircle {
    public static void getArea() {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter the radius Of Circle");
            int redius = sc.nextInt();
            double area = 3.14 * redius * redius;
            System.out.println("Area Of Circle Is ->" + area);
            System.out.println(" ");
        }
        Main.HomePage();
    }
}
