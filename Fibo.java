package practisecode;

public class Fibo 
{
	public static void main(String [] args)
	{
		int max = 10;
		int a =0;
		int b = 1;
		
		System.out.println("The fibonacci Series of "+max);
		
		for(int i =0; i<=max ; i++)
		{
			System.out.print(a+" ");
			
			int temp = a +b;
			a = b ;
			b = temp;
		}
	}
}
