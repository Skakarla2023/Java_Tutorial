package g;

public class Mainone 
{
	public static void main(String[] args)
	{
		Pig p=new Pig();
		p.makesound();
		
		Cow c=new Cow();
		c.makesound();
		
		Animal[] animals= {p,c};
		for(Animal animal:animals)
		{
			System.out.println(animal.makesound());
		}
	}
}
