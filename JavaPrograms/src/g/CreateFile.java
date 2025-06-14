package g;

import java.io.File;
import java.io.IOException;

public class CreateFile 
{	
	public static void main(String[] args)
	{
		try
		{
			File myobj=new  File("JavaFile1.txt");
			if(myobj.createNewFile())
			{
				System.out.println("File succesfully created\n");
			}
			else
			{
				System.out.println("File already exists");
			}
		}
		catch(IOException ie)
		{
			System.out.println("Something went wrong");
			System.out.println(ie);
			ie.printStackTrace();
		}
	}
}
