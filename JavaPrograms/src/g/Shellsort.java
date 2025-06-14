package g;

public class Shellsort 
{
	public static int partition(int arr[],int low,int high)
	{
		int pivot=arr[high];
		int i=low-1;		
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		arr[high]=temp;
		return i;
	}
	public static void quicksort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int pi=partition(arr,low,high);
			quicksort(arr,low,pi-1);
			quicksort(arr,pi+1,high);
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {12,74,39,62,33};
		int n=arr.length;		
		quicksort(arr,0,n-1);
		System.out.println("Sorted array:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}		
	}
}
