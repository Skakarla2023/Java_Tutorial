package g;

public class Internal4a 
{
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle();
		r.CalculateAre();
		Circle c=new Circle();
		c.CalculateArea();
	}
}

class Shape
{
	public void calculateArea()
	{
		System.out.println("Calculating the area:");
	}
}
class Rectangle extends Shape
{
	private int l=8;
	private int b=3;
	public void CalculateAre()
	{
		super.calculateArea();
		System.out.println("calculating the are: "+(l*b));
	}
}
class Circle extends Shape
{
	private int r=8;
	public void CalculateArea()
	{
		super.calculateArea();
		System.out.println("Area of Circle: "+3.14*r*r);
	}
}
