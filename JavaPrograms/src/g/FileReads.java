package g;
import java.io.*;

public class FileReads
{
	public static void main(String[] args)
	{
		String path="C:\\Users\\HP\\OneDrive\\Documents\\text files\\file1.txt";
		int n;
		try(FileInputStream fis=new FileInputStream(path))
		{
			System.out.println("Read data from file:");
			while((n=fis.read())!=-1)
			{
				System.out.println((char)n);
			}
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
	}
}
