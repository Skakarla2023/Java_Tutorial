package g;

import java.util.*;
import java.lang.*;

public class Reverse
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		String str;
		System.out.println("Enter the string: ");
		str=obj.nextLine();
		int len=str.length();
		System.out.println("Original string is:"+str);
		System.out.println("Reversed string:");
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println("\n");
	}
}
