package g;
import java.util.*;
public class Linkedlists {
	public static void main(String[] args)
	{
		LinkedList<String> cars=new LinkedList<String>();
		cars.addFirst("Tata");
		cars.addFirst("Lamborghini");
		cars.addLast("Renault");
		cars.addLast("Bugati");
		cars.getFirst();
		System.out.println(cars);
	}
}
