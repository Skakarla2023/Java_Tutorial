package g;
import java.util.*;
import java.lang.*;
public class Palindrome 
{
	public static void main(String[] args)
	{
		int rev=0,n,r;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter number: ");
		n=obj.nextInt();
		int temp=n;
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n/=10;
		}
		if(temp==rev)
		{
			System.out.println("Palindrome ");
		}
		else
		{
			System.out.println("not a Palindrome ");
		}
		
	}
}
