package g;

public class Qs2 
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
		int[] arr= {11,56,34,24,22,64,49};
		int n=arr.length;
		
		quicksort(arr,0,n-1);
		System.out.println("Sorted Array: ");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
		System.out.println();
	}
}
