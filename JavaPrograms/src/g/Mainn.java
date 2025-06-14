package g;

public class Mainn {
	public static void main(String[] args)
	{
		OuterClass myobj=new OuterClass();
		OuterClass.InnerClass myinner=myobj.new InnerClass();
		System.out.println(myinner.mypublicmethod());
	}

}
