package g;

import java.util.*;
import java.lang.*;

public class Internal1c
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		System.out.println("Prime numbers from 1 to "+num+" are: ");
		for(int i=0;i<num;i++)
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
