package g;

import java.util.*;
import java.lang.*;

class InvalidAgeException extends Exception
{
	InvalidAgeException(String str)
	{
		super(str);
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=obj.nextInt();
		try
		{
			if(age<18)
			{
				InvalidAgeException iae=new InvalidAgeException("Invalid age");
				throw iae;
			}
			else
			{
				System.out.println("Your age is valid");
			}
		}
		catch(InvalidAgeException iae)
		{
			System.out.println(iae);
		}
		finally
		{
			System.out.println("End of try catch block");
		}
	}
}
