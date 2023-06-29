package practisecode;
import java.util.Scanner;
public class PalindromeNumber 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int remainder , result=0 ,temp;
		
		temp = number;
		
		while(number > 0)
		{
			remainder = number%10;
			result = (result*10)+remainder;
			number = number/10;
			
		}
		
		if(temp == result)
		{
			System.out.println("The Number is Palindrome");
		}
		else
		{
			System.out.println("The Number is Not Palindrome");
		}
		
	}
}
