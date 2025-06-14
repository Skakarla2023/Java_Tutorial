package g;
import java.io.*;
public class FileWrites 
{
	public static void main(String[] args)
	{
		String path="G:\C\Java.txt";
		try(FileOutputStream fos=new FileOutputStream("G:\C\Java.txt");DataInputStream dis=new DataInputStream(System.in))
		{
			char ch;
			System.out.println("Write data to file:");
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
