package g;

import java.util.*;

public class New1
{
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int si=0;
		int ei=arr.length-1;
		int mid=(si+ei)/2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key:");
		int a=sc.nextInt();
		if(a!=0)
		{  
			if(a==arr[mid])
			{
				System.out.println("Element found at"+mid+" position");
			}
			else if(a>arr[mid])
			{
				si=mid+1;
			}
			else if(a<arr[mid])
			{
				ei=mid-1;
			}
			else    
			{
				System.out.println("Eleemnt not found in the array.");
			}
		}
		
	}
}
