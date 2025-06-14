package g;

public class SubSuper {
	protected String brand="Tata";
}
class Bike extends SubSuper
{
	private String modelname="Harrier";
	public static void main(String[] args)
	{
		Bike mycar=new Bike();
		System.out.println(mycar.brand+" "+mycar.modelname);
	}
}
