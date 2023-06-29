package practisecode;
import java.util.Scanner;
public class EvenNumberRange 
{
	static boolean evenrange(int n)
	{
		for(int i =1 ; i<=n;i++)
		{
			if(n%2==0)
			{
				return true;
			}
		}
		
		return false;
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(int i = start ;i<=end;i++)
		{
			if(evenrange(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	
}
