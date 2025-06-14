import java.util.*;

public class Arraylist {
	public static void main(String[] args){
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Tata");
		cars.add("Renault");
		cars.add("Lamborghini");
		cars.remove(0);
		System.out.println(cars);
		System.out.println(cars.size());
		for(int i=0;i<cars.size();i++)
		{
			System.out.println(cars.get(i));
		}
		
		
		
	}
}
