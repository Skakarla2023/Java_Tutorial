package g;
import java.lang.*;
public class Maximumsubarraysum
{
	public static void main(String[] args)
	{
		int n=5;
		int[] arr= {1,2,3,4,5};
		int maxsum;
		for(int st=0;st<n;st++)
		{
			int cursum=0;
			for(int end=st;end<n;end++)
			{
				cursum+=arr[end];
				maxsum=int max(int cursum,int maxsum);
			}
		}
	}
}
