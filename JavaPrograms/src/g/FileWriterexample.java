package g;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterexample 
{
	public static void main(String[] args)
	{
		String path="file1.txt";
		try(FileWriter fw=new FileWriter(path))
		{
			fw.write("Hello World!");
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
	}
}
