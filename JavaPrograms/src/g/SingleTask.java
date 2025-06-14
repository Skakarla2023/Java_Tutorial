package g;
public class SingleTask
{
	public static void main(String[] args)
	{
		Execute e=new Execute();
		Thread t=new Thread();
		t.start();
	}
}
class Execute extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("i:"+i);
		}
	}
}
