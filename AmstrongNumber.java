package practisecode;
import java.util.Scanner;
public class AmstrongNumber 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3 Digit Number ");
		int number = sc.nextInt();
		int remainder=0;
		int cubesum=0;
		int num = number;
		
		while(num >0)
		{
			remainder = num%10; 
			cubesum = cubesum +(remainder*remainder*remainder);
			num = num/10;
		}
		
		if(number==cubesum)
		{
			System.out.println("The Number is Amstrong Number");
		}
		else
		{
			System.out.println("The Number is not Amstring Number");
		}
	}
}
