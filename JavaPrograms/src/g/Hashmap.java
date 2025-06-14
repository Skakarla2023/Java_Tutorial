package g;
import java.util.*;
public class Hashmap {
	public static void main(String[] args)
	{
		HashMap<String,String> Cities=new HashMap<String,String>();
		Cities.put("India","New Delhi");
		Cities.put("England","London");
		Cities.put("USA","Washington DC");
		Cities.put("Norway","Oslo");
		Cities.put("Germany","Berlin");
		System.out.println(Cities.get("India"));
		System.out.println(Cities.remove("USA"));
		System.out.println(Cities);	
		System.out.println(Cities.size());	
	}

}
