package g;
import java.io.FileWriter;
import java.io.IOException;
public class WritetoFile
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter myw = new FileWriter("myfile.txt");
			myw.write("Files in java might be tricky,but it is fun enough.");
			myw.close();
			System.out.println("Successfully written to the file");
		}
		catch(IOException e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}
