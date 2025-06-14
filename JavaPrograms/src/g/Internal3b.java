package g;

import java.util.*;
import java.lang.*;

public class Internal3b
{
	public static void main(String[] args)
	{
		Execute c=new Execute();
		int sum1=c.add(5,6);
		int sub1=c.sub(9,2);
		int mul1=c.mul(4,3);
		int div1=c.div(90, 3);
		double sum2=c.add(4.5, 3.8);
		double sub2=c.sub(9.32, 3.79);
		double mul2=c.mul(5.8, 8.2);
		double div2=c.div(7.5, 6.2);
		System.out.println("Integer sum:"+sum1);
		System.out.println("Integer difference:"+sub1);
		System.out.println("Integer product:"+mul1);
		System.out.println("Integer division:"+div1);
		System.out.println("Double sum:"+sum1);
		System.out.println("Double difference:"+sub2);
		System.out.println("Double product:"+mul2);
		System.out.println("Double division:"+div2);
	}
}

class Execute
{
	private int a,b;
	private double x,y;
	int add(int i,int j)
	{
		return i+j;
	}
	double add(double i,double j)
	{
		return i+j;
	}
	int sub(int i,int j)
	{
		return i-j;
	}
	double sub(double i,double j)
	{
		return i-j;
	}
	int mul(int i,int j)
	{
		return i*j;
	}
	double mul(double i,double j)
	{
		return i*j;
	}
	int div(int i,int j)
	{
		return i/j;
	}
	double div(double i,double j)
	{
		return i/j;
	}
}

