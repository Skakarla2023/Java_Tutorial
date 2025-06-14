package g;

import java.io.IOException;
import java.io.FileReader;
public class FileReaderexample
{
	public static void main(String[] args)
	{
		String path="file1.txt";
		try(FileReader fr=new FileReader(path))
		{
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.println((char)i);
			}
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
	}
}

