package g;

public class Animal {
	public void animalsound()
	{
		System.out.println("The Animal makes a sound");
	}
}
class Pig extends Animal
{
	public void animalsound()
	{
		System.out.println("The pig saya:wee wee");
	}
}
class Dog extends Animal
{
	public void animalsound()
	{
		System.out.println("The dog says:bow wow");
	}
}
