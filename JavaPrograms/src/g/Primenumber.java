package g;

import java.util.*;

public class Primenumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Emter a number:");
		int num=sc.nextInt();
		System.out.println("Primen numbers from 1 to "+ num +":");
		for(int i=1;i<=num;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i+" ");
			}
		}		
	}
	public static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
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
