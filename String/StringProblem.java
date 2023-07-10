package String;


import java.util.Arrays;
import java.util.Scanner;

public class StringProblem {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String [] array = new String[n];
        int totallength =0;

        for(int i =0;i<n;i++)
        {
            array[i] =sc.next();
            totallength += array[i].length();
        }
        System.out.println(Arrays.toString(array));
        System.out.println(totallength);








    }
}
