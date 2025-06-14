package g;

public class Procon 
{
	public static void main(String[] args)
	{
		Producer p=new Producer();
		Consumer c=new Consumer(p);
		Thread t1=new Thread(p);
		Thread t2=new Threadd(c);
		t2.start();
		t1.start();
	}
	static class Producer extends Thread
	{
		StringBuffer buffer;
		Producer()
		{
			buffer=new StringBuffer(4);
		}
		public void run()
		{
			synchronized(buffer)
			{
				for(int i=0;i<4;i++)
				{
					try
					{
					buffer.append(i);
					System.out.println("Produced item:"+i);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			System.out.println("Buffer is FULL");
			buffer.notify();
		}
		
	}
	static class Consumer extends Thread
	{
		Producer p;
		Consumer(Producer temp)
		{
			p=temp;
		}
		public void run()
		{
			synchronized(p.buffer)
			{
				try
				{
					p.buffer.wait();
				}
				catch(InterruptedException ie)
				{
					System.out.println(ie);
				}
				for(int i=0;i<4;i++)
				{
					System.out.println("Consumed item:"+p.buffer.charAt(i));
				}
				System.out.println("Buffer is empty");
			}
		}
	}
}
