package g;

public class ThrowExample
{
	public static void main(String[] args)
	{
		try
		{
			checkAge(-5);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Exception caught "+e.getMessage());
		}
	}
	static void checkAge(int num)
	{
		if(num<0)
		{
			throw new IllegalArgumentException("Number must be non-negative");
		}
		System.out.println("Number is valid:"+num);
	}
}
