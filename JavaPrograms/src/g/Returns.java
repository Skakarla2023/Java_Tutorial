package g;

public class Returns {
	static int mynumbers(int x)
	{
		return x+10;//using return statement in our method.
	}
	static int mynumber(int a,int b)
	{
		return a+b;//returning multiple values.
	}
	public static void  main(String[] args)
	{
		System.out.println(mynumbers(3));
		System.out.println(mynumber(5,6));
		
	}

}
