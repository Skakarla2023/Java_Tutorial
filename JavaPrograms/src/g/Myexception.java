package g;

class Myexception extends Exception
{
	
	private static int ac[]= {1001,1002,1003,1004};
	private static String name[]= {"A","B","C","D"};
	private static float bal[]= {12000,980,56000,14000};
	
	Myexception(String str)
	{
		super(str);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Ac"+"\t"+"Name"+"\t"+"Bal");
		try
		{
			for(int i=0;i<4;i++)
			{
				if(bal[i]<1000)
				{
					Myexception me=new Myexception("Balance is less than 1000");
					throw me;
				}
				else
				{
					System.out.println(ac[i]+"\t"+name[i]+"\t"+bal[i]);
				}
			}
		}
		catch(Myexception me)
		{
			System.out.println(me);
		}
		finally
		{
			System.out.println("Process terminated");
		}
	}
}
