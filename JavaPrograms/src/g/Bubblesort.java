package g;

public class Bubblesort
{
	public static void main(String[] args)
	{
		int arr[]= {3,2,8,6,4,9,1,12},i,j,n;
		n=arr.length;
		System.out.println("Array before sorting:");
		for(i=0;i<n-1;i++)
		{
			System.out.println(arr[i]);
		}
		for(i=0;i<n-1;i++)//i refers to iteration
		{
			for(j=0;j<n-i-1;j++)//j refers to the element index
				
				
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
	}
		System.out.println("Array after sorting:");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
