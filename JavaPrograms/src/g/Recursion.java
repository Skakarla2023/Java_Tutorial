package g;

public class Recursion {
	public static void main(String[] args)
	{
		int res=sum(10);
		System.out.println(res);
	}
	public static int sum(int k)//declaring the function as public so it can be accessed all over the program.
	{
		if(k>0)
		{
			return k+sum(k-1);//function calling itself
		}
		else
		{
			return 0;
		}
	}

}
