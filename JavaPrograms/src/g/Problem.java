package g;

public class Problem 
{
	public static void main(String[] args)
	{
		int arr[]= {12,0,5,6,0,8,0,3,2,1};
		for(int i:arr)
		{
			System.out.println(arr[i]);
		}
		int j;
		for(int i=0;i<arr.length;i++)
		{
			j=0;
			if(arr[i]==0)
			{
				
			}
			j++;
		}
		
		void swap(int i,int j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}

}
