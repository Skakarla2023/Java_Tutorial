package g;

public class Traversinginds
{
	public static void main(String[] args)
	{
		int[] arr= {12,34,67,89,91};
		for(int i:arr)//traversing through the elements in a data structure
		{
			System.out.println(i);
		}
		int key=91;
		for(int i:arr)// Searching for an element in a data structure
		{
			if(i==key)
			{
				System.out.println("Element found");
			}
		}
		
	}
}
