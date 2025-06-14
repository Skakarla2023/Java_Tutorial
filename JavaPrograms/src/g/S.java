package g;
import java.util.*;
public class Car
{
	public String brand;
	public String model;
	public int year;
	public Car(String b,String m,int y)
	{
		brand =b;
		model=m;
		year=y;
	}
}
public class S
{
	public static void main(String[] args)
	{
		ArrayList<Car> mycars=new ArrayList<Car>();
		mycars.add(new Car("Tata","Altroz",1990));
		mycars.add(new Car("Renault","kiger",1897));
		Collections.sort(mycars,(obj1,obj2)->{
			Car a=(Car) obj1;
			Car b=(Car) obj2;
			if(a.year<b.year) return -1;
			if(a.year>b.year) return 1;
			return 0;
		});
		for(Car c:mycars)
		{
			System.out.println(c.brand+" "+c.model+" "+c.year);
		}
	}
}
