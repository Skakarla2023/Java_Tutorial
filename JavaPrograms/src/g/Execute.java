package g;

public interface Interface1
{
	float height=6.2f;
	void height();
}
public interface Interface2
{
	float height=5.8f;
	void height();
}
class Child implements Interface1,Interface2
{
	public void height()
	{
		float height=(Interface1.height+Interface2.height)/2;
		System.out.println("Height:"+height);
	}
}
public class Execute
{
	public static void main(String[] args)
	{
		Child ch=new Child();
		ch.height();
	}
}

