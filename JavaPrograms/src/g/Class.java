package g;

public class Class {
	//OOP helps in maintaining code "DRY"-Don't repeat yourself.
	//it provides a clear and easier to execute
	int s=83;
	public static void main(String[] args)
	{
		Class myobj1=new Class();
		Class myobj2=new Class();//creates a new object of the Class class named myobj
		myobj2.s=38;             //creating another obj accessing the attributes of the class.
		System.out.println(myobj1.s);
		System.out.println(myobj2.s);
	}

}
