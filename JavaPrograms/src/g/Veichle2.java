package g;


	public class Veichle2
	{
		protected String brand="Renault";
		public void honk()
		{
			System.out.println("Tuut,Tuut");
		}
	}
	class Car1 extends Veichle2
	{
		private String modelname="Kiger";
		public static void main(String[] args)
		{
			Car1 mycar=new Car1();
			mycar.honk();
			System.out.println(mycar.brand+" "+mycar.modelname);
		}
	}

