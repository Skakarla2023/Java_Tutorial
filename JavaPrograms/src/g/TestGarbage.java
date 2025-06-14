package g;

public class TestGarbage
{
	public void display()
	{
		System.out.println("Garbage is collected");
	}
	public static void main(String[]args)
	{
		TestGarbage n=new TestGarbage();
		TestGarbage a=new TestGarbage();
		n=null;
		a=null;
		System.gc();
	}
	
}
