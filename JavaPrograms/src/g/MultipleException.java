package g;

import java.util.*;
import java.lang.*;

public class MultipleException
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Open the file:");
			int a,b;
			System.out.println("Enter 2 values:");
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			b=sc.nextInt();
			int res=a/b;
			System.out.println("Result: "+res);
			int s[]= {12,45,89};
			s[10]=1;					
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception ");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("AIE");
		}
		finally
		{
			System.out.println("End of try catch block");
		}
	}
}
