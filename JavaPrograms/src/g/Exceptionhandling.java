package g;

public class Exceptionhandling
{
	public static void main(String[] args)
	{
		try
		{
		int[] mynum= {1,2,3,4};
		System.out.println(mynum[10]);
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}
		finally
		{
			System.out.println("The 'try catch' is finished");
		}
	}
}
