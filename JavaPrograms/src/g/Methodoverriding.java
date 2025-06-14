package g;

public class Methodoverriding 
{
	public static void main(String[] args)
	{
		Two t=new Two();
		t.mym(36);
	}
}
class One
{
	public static void mym(double x)
	{
		System.out.println("double:"+(x+x));
	}
}
class Two extends One
{
	public static void mym(double x)
	{
		System.out.println("Sqyare root:"+Math.sqrt(x));
	}
}
