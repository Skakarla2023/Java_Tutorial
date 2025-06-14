package g;

public class Abstract2 {
	public static void main(String[] args)
	{
		Child myobj=new Child();
		System.out.println("Name:"+myobj.name);
		System.out.println("Age:"+myobj.age);
		System.out.println("Graduation year:"+myobj.gradyear);
		myobj.study();

	}
}
