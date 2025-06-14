package g;

public class Constructor {
	int s;
	public Constructor()//creating a class constructor for the Constructor class
	{
		s=96;
	}
	public static void main(String[] args) {
		Constructor obj=new Constructor();
		System.out.println(obj.s);
	}

}
