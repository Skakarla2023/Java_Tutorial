package g;

public class Staticc
{
	static void mystaticmethod()               //creating a static method
	{
		System.out.println("Static method  can be called without creating objects");
	}
	public void mypublicmethod()               //creating a public method
	{
		System.out.println("Public method is called only using the objects");
	}
	public static void main(String[] args)
	{
		mystaticmethod();                      //calling the static method without using the objects
		Staticc st=new Staticc();              //creating objects of the Staticc class to access the public method of the class
		st.mypublicmethod();                   //calling the method using the object created
	}
}
