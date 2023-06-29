package practisecode;
import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = false;
		
		for(int i =2; i< n/2;i++)
		{
			if(n%i==0)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("The number is not prime");
		}
	}

}
