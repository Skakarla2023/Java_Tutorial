package g;

public class Execute1 
{
	 public static void main(String[] args)
	 {
		 Two t=new Two(); 
	 }
}
class One 
{ 
	One() 
	{ System.out.println("one"); 
	}
}
class Two extends One 
{
	Two()
	{
		super();
		System.out.println("Two");
	}
}
