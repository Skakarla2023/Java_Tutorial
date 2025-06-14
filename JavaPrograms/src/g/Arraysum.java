package g;

public class Arraysum 
{
	public static void main(String[] args)
	{
		int sum=0;
		int[] arr= {15,82,29,36,49};
		for(int i:arr)
		{
			sum+=i;
		}
		System.out.println("Sum of array elements: "+sum);
	}
}
