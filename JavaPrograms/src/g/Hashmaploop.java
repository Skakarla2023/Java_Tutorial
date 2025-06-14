package g;
import java.util.*;
public class Hashmaploop {
	public static void main(String[] args)
	{
		HashMap<String,Integer> people=new HashMap<String,Integer>();//declaring a hashmap 
		
		people.put("Satwika",18);
		people.put("Anila",11);
		people.put("Sandeep",15);
		for(String i:people.keySet())///looping through the keys
		{
		System.out.println("Key:"+i+" Value:"+people.get(i));//using the get() method we can get the values by entering the key value that's why we use the key (i) here
		}
	}
}
