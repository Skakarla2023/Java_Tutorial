package g;

class Employee 
{
	private String name;
	private int id,salary;
	Employee()
	{
		name="Arun";
		id=213546;
		salary=45000;
	}
	Employee(String n,int i,int s)
	{
		name=n;
		id=i;
		salary=s;
	}
	void print_data() {
		System.out.println("Name:"+name);
		System.out.println("Id"+id);
		System.out.println("salary:"+salary);
	}
}
class Internal3a
{
	public static void main(String[] args)
	{
		Employee em=new Employee();
		em.print_data();
		Employee emp=new Employee("Sara",246145,60000);
		emp.print_data();
	}
}