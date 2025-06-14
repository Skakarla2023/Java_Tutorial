package g;

public class Halting2
{
	public static int sum1(int start1,int end)
	{
		if(end>start1)
		{
			return end+sum1(start1,end-1);
		}
		else
		{
			return end;
		}
	}
	int start1,end;
	public static void main(String[] args)
	{
		int res=sum1(5,10);
		System.out.println(res);
	}
}
