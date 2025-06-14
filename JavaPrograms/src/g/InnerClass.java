package g;
class Outer        //creating an outer class
{
	int x=10;
	class Inner     //creating an inner/nested class
	{
		int y=5;
	}
}
public class InnerClass 
{
	public static void main(String[] args)
	{
		Outer myouter=new Outer();   //creating an object for the outer class
		Outer.Inner myinner=myouter.new Inner();  //creating obj for the inner class
		System.out.println(myinner.y+myouter.x);
	}
}
