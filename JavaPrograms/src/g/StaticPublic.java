package g;

public class StaticPublic {
	static void mystaticmethod()//static method
	{
		System.out.println("Static methods can be called without creating any objects");
	}
	public void mypublicmethod()//public method
	{
		System.out.println("Public methods can be accessed only by objects.");
	}
	public static void main(String[] args)
	{
		mystaticmethod();       //calling static method without using an object.
		StaticPublic myobj=new StaticPublic();//creating an object.
		myobj.mypublicmethod();//calling public method using the object.
		
	}

}
