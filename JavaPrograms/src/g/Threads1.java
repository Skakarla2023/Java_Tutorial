package g;

public class Threads1 extends Thread
{
	public static void main(String[] args)
	{
		Threads1 th=new Threads1();
		th.start();
		System.out.println("This code is running outside the thread");
	}
	public void run()
	{
		System.out.println("This code is running inside the thread\n");
	}
}
