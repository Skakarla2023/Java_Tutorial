package g;
import java.io.*;
import java.util.*;

public class PrimeNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);// Here we've used the scanner class to get input from the user.
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		System.out.println("Prime numbers from 1 to "+num+":");
		for(int i=1;i<=num;i++)
		{
			if(isPrime(i))// through a boolean function isprime() we're checking if the number is prime and incrementing it's value if the num is prime
			{
				System.out.println(i+" ");
			}
		}
	}
	public static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;// return false if the number is 1 or less than 1 as they're neither primes nor composites.
		}
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
