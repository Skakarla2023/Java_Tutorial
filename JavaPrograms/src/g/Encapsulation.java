package g;

public class Encapsulation
{
	private String name;            //as the name is declared private it can't be accessed from outside the class   
	public String getName()
	{
		return name;             
	}
	public void setName(String newname)
	{
		this.name=newname;          //this keyword is used to refer to the current object.
	}
}
