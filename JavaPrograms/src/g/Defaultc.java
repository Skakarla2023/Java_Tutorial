package g;

class Defaultc
{
	public static void main(String[] args)
	{
		Car mycar=new Car();
		System.out.println("Color"+mycar.color+"No:"+mycar.no);
	}
}
class Car
{
	String color;
	int no;
	public Car()
	{
		this.color="white";
		this.no=12;
	}
}
