package g;

public class Mythread implements Runnable
{
	public static void main(String[] args)
	{
		Mythread mt=new Mythread();
		Thread th=new Thread(mt);
		th.start();
		System.out.println("This code is running outside the thread.");
	}
	public void run()
	{
		System.out.println("This code is running inside the thread");
	}
}
