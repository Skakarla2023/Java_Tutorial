package g;

public class Multiplet 
{
	volatile static int counter=0;
	int limit;
	Multiplet(int limit)
	{
		this.limit=limit;
	}
	public synchronized void printOddnum()
	{
		while(counter<=limit)
		{
			if(counter%2==1)
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
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
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
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Multiplet printer=new Multiplet(10);
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
