package g;
import java.util.HashSet;
public class Hashset
{
	public static void main(String[] args)
	{
		HashSet<String> myhash=new HashSet<String>();
		myhash.add("BMW");
		myhash.add("Benz");
		myhash.add("Lambhorgini");
		myhash.add("BMW");
		System.out.println(myhash);
		for(String i:myhash)
		{
			System.out.println(i);
		}
		System.out.println(myhash.size());
		System.out.println(myhash.contains("BMW"));
		HashSet<Integer> mynum=new HashSet<Integer>();
		mynum.add(10);
		mynum.add(29);
		mynum.add(45);
		System.out.println(mynum);
		for(Integer i:mynum)
		{
			System.out.println(i);
		}
		}
}

