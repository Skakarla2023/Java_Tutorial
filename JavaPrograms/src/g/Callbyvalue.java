package g;

class Some
{
	int temp,x,y;
	Some(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void swap()
	{
		temp=this.x;
		this.x=this.y;
		this.y=temp;
	}
	void display()
	{
		System.out.println("x:"+this.x);
		System.out.println("y:"+this.y);
	}
}
public class Callbyvalue
{
	public static void main(String[] args)
	{
		Some s=new Some(3,4);
		System.out.println("Before swap:");
		s.display();
		System.out.println("after swap:");
		s.swap();
		s.display();
	}
}