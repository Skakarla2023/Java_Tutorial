package g;

import java.util.*;

public class Exception1
{
	public static void main(String[] args)
	{
		try
		{
			int a,b;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number:");
			a=sc.nextInt();
			b=sc.nextInt();
			int res=a/b;
			System.out.println("Result:"+res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division error");
		}
		finally
		{
			System.out.println("End of try catch");
		}
	}
}
