package g;

public class Thread1 extends Thread			//declares a class named thread1 that extends the thread class,allowing it to behave as a thread.
{
	public static void main(String[] args)
	{
		
		Thread1 thread=new Thread1();		//creates a new instance of the Thread1 class which represents a new thread
		thread.start();						//starts the thread executing the run method
		System.out.println("This code is outside of the thread");
	
	}
	public void run()						//overrides the run() method from Thread class defining the code to execute in the new thread
	{
		
		System.out.println("This code is running in a thread");
	
	}
}
