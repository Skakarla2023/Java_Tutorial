package g;

public class Veichle {
	protected String brand="Renault";
	public void honk()
	{
		System.out.println("Tuut,Tuut");
	}
}
class Car extends Veichle
{
	private String modelname="Kiger";
	public static void main(String[] args)
	{
		Car mycar=new Car();
		mycar.honk();
		System.out.println(mycar.brand+" "+mycar.modelname);
	}
}
