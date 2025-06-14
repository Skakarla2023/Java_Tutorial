package g;

public class Arithmeticexception {
	static void checkage(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Access denied-you are too young");
		}
		else
		{
			System.out.println("Access granted-you are old enough!");
		}
	}
	public static void main(String[] args)
	{
		
		checkage(19);
	}

}
