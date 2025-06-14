package g;
import java.io.*;
public class FileStreams 
{
// Streams represent a flow of data.
// Streams are categorized into two. Input and Output, Input streams are used to read data from a source, and output streams are used to write data to a destination.
	public static void main(String[] args)
	{
		String path="C:\\Users\\HP\\OneDrive\\Documents\\text files\\file1.txt";
		try(FileOutputStream fos=new FileOutputStream(path);DataInputStream dis=new DataInputStream(System.in))
		{
			System.out.println("Read data from console:");
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
