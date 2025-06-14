package g;
import java.io.File;
public class FileDelete 
{
	public static void main(String[] args)
	{
		File myobj=new File("filename.txt");
		if(myobj.delete())
		{
			System.out.println("Deleted the file:filename.txt");
		}
		else
		{
			System.out.println("Failed to delete the file");
		}
	}
}
