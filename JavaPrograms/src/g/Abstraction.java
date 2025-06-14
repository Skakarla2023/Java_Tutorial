package g;

abstract class Abstraction
{
	public abstract void animalsound();   //abstract method(does not have a body)
	public void sleep()                   //regular method  
	{
		System.out.println("Zzz");
	}
}
class Pig extends Abstraction
{
	public void animalsound()
	{
		System.out.println("The pig says wee wee");
	}
}
												