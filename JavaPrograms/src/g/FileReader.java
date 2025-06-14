package g;

import java.io.FileReader;
import java.io.Exception;

public class FileReader
{
	public static void main(String[] args)
	{
		String path="G:\C\Java.txt";
		try(FileReader fr=new FileReader("G:\C\Java.txt"))
		{
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.println((char)i);
			}
		}
		catch(IOException ie)
		{
			System.out.println("Error");
		}
	}
}