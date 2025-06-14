package g;

public class Wrapperclass
{
	public static void main(String[] args)
	{
		Integer mynum=12;
		Double doub=2.55;
		Character myname='S';
		System.out.println(mynum);
		System.out.println(myname);
		System.out.println(doub);
		System.out.println(mynum.intValue());//these methods are used to print the values associated with the wrapper class objects.
		System.out.println(myname.charValue());//the output is same in both the cases,it's just another way to print the values.
		System.out.println(doub.doubleValue());
		String mystr=mynum.toString();//this is the method used to convert an integer to a String
		System.out.println(mystr.length());
		System.out.println(mystr);
	}
}

