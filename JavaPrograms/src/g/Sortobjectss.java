package g;
import java.util.*;
import java.lang.*;
class Car
{
	public String brand;
	public String model;
	public int year;
	
	public Car(String b,String s,int k)
	{
		brand=b;
		model=s;
		year=k;
	}
}
public class Sortobjectss implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Car a=(Car) obj1;
		Car b=(Car) obj2;
		if(a.year<b.year) return -1;
		if(a.year>b.year) return 1;
		return 0;
	}
}
public class Sortobjects
{
	public static void main(String[] args)
	{
		ArrayList<Car> mycars=new ArrayList<Car>();
		mycars.add(new Car("BMW","X5",1999));
		mycars.add(new Car("Renault","Triber",2000));
		Comparator myc=new Sortobjectss();
		Collections.sort(mycars,myc);
		for(Car c:mycars)
		{
			System.out.println(c.brand+" "+c.model+" "+c.year);
		}
	}
}