package g;

import java.lang.*;
import java.util.*;

public class ArithException 
{
	public void divide(int a,int b)
	{
		int res=a/b;
		System.out.println("Result: "+res);
		int arr[]= {12,45,78};
		arr[10]=50;
	}
	public static void main(String[] args)
	{
		try
		{
			int a,b;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 2 values:");
			a=sc.nextInt();
			b=sc.nextInt();
			ArithException s=new ArithException();
			s.divide(a,b);		
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			aie.printStackTrace();
		}
		finally
		{
			System.out.println("End of try catch block.");
		}
	}
}
