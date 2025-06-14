package g;
import java.util.ArrayList;
import java.util.Iterator;
public class Iterator1 {
	public static void main(String[] args)
	{
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Benz");
		cars.add("BMW");
		cars.add("Tata");
		Iterator<String> it=cars.iterator();
		System.out.println(it.next());
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
