package g;

public class Methods {
	static void myfun()//creating a method as a part of the class,it is not an object of the class
	{
		System.out.println("This is a Method");
	}
	static void printnames(String myname)//passing single parameter
	{
		System.out.println(myname+",accepted");
	}
	static void details(String names,int age)//passing multiple parameters into the function
	{
		System.out.println(names+" is "+age);
	}
	public static void main(String[] args)
	{
		myfun();//calling the function using its name.
		myfun();//calling it multiple times 
		myfun();
		printnames("Anila");
		printnames("Pavani");
		printnames("Harshini");
		details("Sat",18);
		details("San",14);
	}

}
