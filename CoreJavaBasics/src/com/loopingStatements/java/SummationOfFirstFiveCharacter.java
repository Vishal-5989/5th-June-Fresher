package com.loopingStatements.java;

public class SummationOfFirstFiveCharacter {

    public  void test()
    {

        int sum = 0;
        for(int i = 'a' ; i<='e' ; i++)
        {
            sum = sum +i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        SummationOfFirstFiveCharacter obj1 = new SummationOfFirstFiveCharacter();
        obj1.test();
    }


}
