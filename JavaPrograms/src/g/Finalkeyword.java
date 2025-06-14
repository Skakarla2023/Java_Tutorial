package g;
class Sample
{
	final int s=29;
	public void access()
	{
		s++;
		System.out.println(s);
	}
}
public class Finalkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Sample sa=new Sample();
			sa.access();
	}

}
