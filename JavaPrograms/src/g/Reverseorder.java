package g;

import java.util.Collections;
import java.util.LinkedList;

public class Reverseorder {
	public static void main(String[] args)
	{
		LinkedList<String> cars=new LinkedList<String>();
		cars.addFirst("Tata");
		cars.addFirst("Lamborghini");
		cars.addLast("Renault");
		cars.addLast("Bugati");
		Collections.sort(cars,Collections.reverseOrder());
		for(String i:cars)
		{
			System.out.println(i);
		}
	}

}
