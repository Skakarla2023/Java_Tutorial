package g;
import java.util.*;
import java.lang.*;
public class Lambdas
{
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(83);
		numbers.add(316);
		numbers.add(5);
		numbers.add(86);
		numbers.forEach((n)->{System.out.println(n);});
	}
}
