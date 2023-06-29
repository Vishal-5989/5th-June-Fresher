package com.loopingStatements.java;

public class PrintFirst5Characters
{

    public void test()
    {
        char first = 'a';
        while (first <= 'e')
        {
            System.out.println(first);
            first++;
        }
    }

    public static void main(String[] args)
    {
        PrintFirst5Characters obj1 = new PrintFirst5Characters();
        obj1.test();
    }
}
