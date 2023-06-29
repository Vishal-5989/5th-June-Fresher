package practisecode;

public class AmstrongNumberRange 
{
	public void AmstrongNumber()
	{
		for(int i =3;i <=1000 ;i++)
		{
			int remainder=0, check;
			int sum =0;
			check = i;
			
			while(check!=0)
			{
				remainder = check%10;
				sum = sum +(remainder*remainder*remainder);
				check = check/10;
			}
			if(sum ==i)
			{
				System.out.println(i+" is a amstrong number");
			}
		}
	}
	public static void main(String [] args)
	{
		AmstrongNumberRange obj = new AmstrongNumberRange();
		obj.AmstrongNumber();
	}
}
