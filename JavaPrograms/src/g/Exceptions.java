package g;
import java.lang.*;
public class Exceptions  
{
	public static void main(String[] args)
	{
		try
		{
			int n=45;
			int s=0;
			int res=n/s;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			ae.printStackTrace();
		}
		finally
		{
			System.out.println("The end of try catch block.");
		}
	}
}
