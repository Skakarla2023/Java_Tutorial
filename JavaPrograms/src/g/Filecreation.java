package g;
import java.io.File;
import java.io.IOException;
public class Filecreation
{
	public static void main(String[] args)
	{
		try
		{
			File myobj=new File("myfile.txt");
			if(myobj.createNewFile())
			{
				System.out.println("File created: ");
			}
			else
			{
				System.out.println("File already exists.");
			}
		}
		catch(IOException e)
		{
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}
}
