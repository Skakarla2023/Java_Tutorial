package g;

public class Writing
{
	public static void main(String[] args)
	{
		int[] arr=new int[26];
		for(int i=0;i<26;i++)
		{
			arr[i]=i+65;
		}
		for(int i:arr)
		{
			System.out.write(i);
			System.out.println();
		}
		
	}
}
