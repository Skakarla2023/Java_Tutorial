package g;

public class Private {
	int x=4;
	private class Inner
	{
		int y=5;
	}
}
public class Main
{
	public static void main(String[] args)
	{
		Private myouter=new Private();
		Private.Inner myinner=myouter.new Inner();
		System.out.println(myinner.y+myouter.x);
	}
}
