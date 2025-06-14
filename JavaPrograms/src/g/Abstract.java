package g;

abstract class Abstract 
{
	public String name="jake";
	public int age=23;
	public abstract void study();

}
class Child extends Abstract
{
	public int gradyear=2026;
	public void study()
	{
		System.out.println("Studying all day long");
	}
}
