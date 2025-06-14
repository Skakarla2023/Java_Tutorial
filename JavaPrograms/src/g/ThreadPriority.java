package g;

public class ThreadPriority extends Thread
{
	public void run()
	{
		//
	}
	public static void main(String[] args)
	{
		ThreadPriority t1=new ThreadPriority();
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		ThreadPriority t2=new ThreadPriority();
		t2.setPriority(3);
		t2.start();
		System.out.println("t1 priority: "+t1.getPriority());
		System.out.println("t2 priority: "+t2.getPriority());
		System.out.println("Current thread name:");
		System.out.print(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
