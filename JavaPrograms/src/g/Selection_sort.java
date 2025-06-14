package g;

public class Selection_sort
{
	public static void main(String[] args)
	{
		int[] myarr= {64,34,25,22,12,11,90,5};
		int n=myarr.length;
		for(int i=0;i<n;i++)
		{
			int min_index=i;
			for(int j=i+1;j<n;j++)
			{
				if(myarr[j]<myarr[min_index])
				{
					min_index=j;
				}			
			}
			int temp=myarr[i];
			myarr[i]=myarr[min_index];
			myarr[min_index]=temp;
		}
		System.out.println("Sorted Array:");
		for(int i=0;i<n;i++)
		{
			System.out.println(myarr[i]);
		}
		System.out.println(" ");
	}
}
