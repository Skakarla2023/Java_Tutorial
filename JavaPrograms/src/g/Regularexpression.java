package g;
import java.util.regex.*;
public class Regularexpression 
{
	public static void main(String[] args)
	{
		Pattern p=Pattern.compile("Satwika",Pattern.CASE_INSENSITIVE);//compile() method is used to enter the text that we wish to search for,along with flag CASE_INSENSITIVE which ignores distinction between uppercase and lowercase letters
		Matcher matcher=p.matcher("Hello from Satwika!");//matcher contains the lines where we search for the text
		boolean matchFound=matcher.find();//find is a boolean method that returns true if the text is found in the lines otherwise false
		if(matchFound)
		{
			System.out.println("Match found!");
		}
		else
		{
			System.out.println("Match not found!");
		}
	}
}
