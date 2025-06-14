package g;
import java.io.*;
public class FileExample2 
{
	public static void main(String[] args)
	{
		String path="C:\\Users\\HP\\OneDrive\\Documents\\text files\\file2.txt";
		try(FileOutputStream fos=new FileOutputStream(path);DataInputStream dis=new DataInputStream(System.in))
		{
			System.out.println("Read data from file:");
			char ch;
			while((ch=(char)dis.read())!='@')
			{
				fos.write(ch);
			}
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
	}
}
