package g;

public class Scope1 {
	public static void main(String[] args)
	{
		{
		//code here cannot use x.
		int x=10;
		//code here can use x.
		System.out.println(x);
		}
	}

}
