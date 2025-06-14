package g;

public class Arrays {
	public static void main(String[] args)
	{
		String[] cars= {"Lamborghini","Rolls Royce","Mitsubishi"};
		for(int i=0;i<cars.length;i++)//using for loop
		{
			System.out.println(cars[i]);
		}
		for(String i:cars)//looping through each element using for each loop
		{
			System.out.println(i);
		}
		int ages[]= {12,23,34,45,56,67,78};
		float sum=0,avg;
		int length=ages.length;
		for(int s:ages)
		{
			sum+=s;
		}
		System.out.println("Sum of ages:" +sum);
		avg=sum/length;
		System.out.println("Average: "+avg);
		int[][] mynum= {{1,2,3},{4,5,6}};
		System.out.println(mynum[1][2]);
	}

}
