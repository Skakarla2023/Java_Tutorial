package g;
class Person
{
	int i,j;
	Person()
	{
		i=4;
		j=7;
	}
	Person(int i1,int j1)
	{
		i=i1;
		j=j1;
		int k=i+j;
		System.out.println("k "+k);
	}	
}

class Constructoroverlaoding 
{
	public static void main(String[] args)
	{
		Person obj=new Person();
		Person obj2=new Person(5,6);
		
	}
}
