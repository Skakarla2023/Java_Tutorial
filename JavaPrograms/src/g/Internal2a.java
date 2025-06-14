package g;

public class Internal2a
{
	public static void main(String[] args)
	{
		int arr[]= {12,34,73,82,37,8,44};
		int max=arr[0];
		System.out.println("Maximum element: ");
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}
