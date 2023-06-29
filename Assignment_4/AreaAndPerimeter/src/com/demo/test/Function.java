package com.demo.test;

public class Function {

    final double PI=3.14;
    public void circleArea(int radius){
        double area=0;
        area= PI*radius*radius;
        System.out.println("Area of Circle is= "+area);
    }

    public void circleCircum(int radius){
        double circum=2*PI*radius;
        System.out.println("Circumference of Circle is= "+circum);
    }
}
