package g;
import java.util.*;
public class MultipleExceptions
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Open the file");
			int n,c;
		    System.out.println("Read n & c:");
		    Scanner sc=new Scanner(System.in);
		    n=sc.nextInt();
		    c=sc.nextInt();
		    int res=n/c;
		    System.out.println("Result: "+res);
		    int a[]= {3,4,5};
		    a[4]=8;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println(aie);
		}
		finally
		{
			System.out.println("Close the file");
		}
	}

}
