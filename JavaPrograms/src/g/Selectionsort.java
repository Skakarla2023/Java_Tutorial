package g;

public class Selectionsort 
{
	public static void main(String[] args)
	{
		int arr[]= {1,7,4,2,3,6,5},i,j,k,n;
		n=arr.length;
		int min=arr[0];
		System.out.println("Array before sorting:");
		for(j=0;j<n;j++)
		{
			System.out.println(arr[j]+" ");
			
		}
		for(i=0;i<n;i++)
		{
			if(min>arr[i])
			{
				int temp=min;
				min=arr[i];
				arr[i]=temp;
				i=i+1;
			}
			else
			{
				i=i+1;
			}
		}
		System.out.println("Array after sotring:");
		for(j=0;j<n;j++)
		{
			System.out.println(arr[j]+" ");
		}
	}
}
		