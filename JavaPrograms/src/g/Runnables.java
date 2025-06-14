package g;

public class Runnables implements Runnable
{
	public static void main(String[] args)
	{
		Runnables obj=new Runnables();
		Thread thread=new Thread(obj);
		thread.start();
		System.out.println("This code is outside of the thread");
	}
	public void run()
	{
		System.out.println("This code is running in a thread"); 
	}
}
