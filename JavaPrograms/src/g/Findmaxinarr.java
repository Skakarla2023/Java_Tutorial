package g;

public class Findmaxinarr 
{
	public static void main(String[] args)
	{
		int[] myarr= {23,78,35,68,92,62};
		int max=myarr[0];
		for(int i:myarr)
		{
			if(i>max)
			{
				max=i;
			}
		}
		System.out.println("Maximum element: "+max);
	}
}
