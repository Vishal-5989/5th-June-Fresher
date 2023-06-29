package com.loopingStatements.java;

public class FindAllTheNumberWhichAreDivisibleByThreeAndSevenBetween0To100 {
    public void test()
    {
        for(int i = 0; i <= 100 ; i++)
        {
            if(i % 3 == 0 && i % 7 == 0)
            {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        FindAllTheNumberWhichAreDivisibleByThreeAndSevenBetween0To100 obj = new FindAllTheNumberWhichAreDivisibleByThreeAndSevenBetween0To100();
        obj.test();
    }
}
