package g;

public class Multithread
{
	volatile static int counter=1;
	int limit;
	Multithread(int limit)
	{
		this.limit=limit;
	}
	public synchronized void printOddnum()
	{
		while(counter<=limit)
		{
			if(counter%2==1)
			{
				System.out.println(Thread.currentThread().getName()+":"+ counter);
				counter++;
				notifyAll();
			}
			else
			{
				try
				{
					wait();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	public synchronized void printEvennum()
	{
		while(counter<=limit)
		{
			if(counter%2==0)
			{
				System.out.println(Thread.currentThread().getName()+":"+counter);
				counter++;
				notifyAll();
			}
			else
			{
				try
				{
					wait();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Multithread printer=new Multithread(10);
		Thread t1=new Thread(new Runnable()
		{
			public void run()
			{
				printer.printOddnum();
			}
		});
		t1.setName("Odd");
		Thread t2=new Thread(new Runnable()
		{
			public void run()
			{
				printer.printEvennum();
			}
		});
		t2.setName("Even");
		t1.start();
		t2.start();
	}
}
