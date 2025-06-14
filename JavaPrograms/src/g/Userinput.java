package g;
import java.util.Scanner;

public class Userinput {
	public static void main(String[] args)
	{
		Scanner myobj=new Scanner(System.in);
		String mname;
		System.out.println("Enter your name:");
		mname=myobj.nextLine();//nextline method is used to read strings
		System.out.println("Your name is:"+mname);
		
	}
}
