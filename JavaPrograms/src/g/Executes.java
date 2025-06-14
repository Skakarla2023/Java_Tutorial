package g;

import java.util.*;
import java.lang.*;

public class Executes 
{
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle();
		r.CalculateArea();
		r.CalculatePerimeter();
		Circle c=new Circle();
		c.CalculateArea();
		c.CalculatePerimeter();    
	}
}

interface Shape
{
	public abstract void CalculateArea();
	public abstract void CalculatePerimeter();
}
class Rectangle implements Shape
{
	private int l=8;
	private int b=5;
	public void CalculateArea()
	{
		System.out.println("Area of rectangle: "+(l*b));
	}
	public void CalculatePerimeter()
	{
		System.out.println("perimter of rectangle: "+(2*(l+b)));
	}
}
class Circle implements Shape
{
	private int r=12;
	public void CalculateArea()
	{
		System.out.println("Area of circle: "+(3.14*r*r));
	}
	public void CalculatePerimeter()
	{
		System.out.println("perimter of circle:"+(2*3.14*r));
	}
}