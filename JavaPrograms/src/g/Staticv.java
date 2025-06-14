package g;

class Demo
{
	static int s=10;
	static void display()
	{
		System.out.println("s:"+s);
	}
}
class Staticv
{
	public static void main(String[] args)
	{
		Demo.display();
	}
}
