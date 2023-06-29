package practisecode;

import java.util.Scanner;

public class OddNumberRange {

	
	static boolean oddrange(int n)
	{
		for(int i = 1 ; i<=n/i;i++)
		{
			if(n % 2==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(int i = start ; i<=end;i++)
		{
			if(oddrange(i))
			{
				System.out.print(i+" ");
			}
		}
	}
}
