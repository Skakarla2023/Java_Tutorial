package g;

public class Executee 
{
	int s=12;
	public static void main(String[] args)
	{
		Executee obj1=new Executee();
		Executee obj2=new Executee();
		obj2.s=90;
		System.out.println(obj1.s);
		System.out.println(obj2.s);
	}
}
