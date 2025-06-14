package g;

public class Enuminswitch {
	public static void main(String[] args)
	{
		Enum1 myv=Enum1.MEDIUM;
	
	switch(myv)
	{
	case LOW:
		System.out.println("Low level");
		break;
	case MEDIUM:
		System.out.println("Medium level");
		break;
	case HIGH:
		System.out.println("High level");
		break;
	}
	for(Enum1 myvar:Enum1.values())//values method returns the constants in the enum in the form of an array.
	{
		System.out.println(myvar);
	}
}}
