# Packages

![image](https://github.com/user-attachments/assets/9a07e1f7-fc06-41c9-ab03-7f43d2f59c0c)

![image](https://github.com/user-attachments/assets/6ac92018-9ca8-428f-a850-68ceb6f394c8)

![image](https://github.com/user-attachments/assets/5a27e15c-00c8-4d72-9d76-c759b5776bbe)

![image](https://github.com/user-attachments/assets/79c53a8e-5911-4318-afbd-cb7cd5adf2c3)

![image](https://github.com/user-attachments/assets/7e8f60cf-97f4-448c-9931-c24483a03125)

![image](https://github.com/user-attachments/assets/804c0706-5466-40c3-a596-718050537ccc)

![image](https://github.com/user-attachments/assets/5bfc0d13-d432-4083-aa72-5163c1d62279)

```java
package com.skakarla.java_Programs;

import java.util.Scanner;

public class NewClass 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		
		// Get a number from user input
		System.out.println("Enter a number:");
		int num = obj.nextInt();
		obj.nextLine(); // Consume the leftover newline
		
		// Get a string from user input
		System.out.println("Enter your name:");
		String myname = obj.nextLine();
		
		System.out.println(num);
		System.out.println(myname);
		
		obj.close(); // Always good to close the Scanner
	}
}
```

Output:
```
Enter a number:
10
Enter your name:
Satwika
10
Satwika
```

![image](https://github.com/user-attachments/assets/b6ac371a-e0d5-4a0d-a40f-c1fb2a9f4b84)

![image](https://github.com/user-attachments/assets/31306b00-866f-40bb-92f2-c02240929f8c)

![image](https://github.com/user-attachments/assets/f73c4d7d-ac2f-431e-a2a4-d01d1828a86c)

```java

// Car.java
package com.skakarla.java_Programs;

public class Car 
{
	
	//declaring the attribute protected so that the child class can access it.
	protected String carname="Mahindra";

	public void mycar()
	{
		System.out.println("This is my car");
	}

}

//Mahindra.java

package com.skakarla.java_Programs;

public class Mahindra extends Car
{
	public static void main(String[] args)
	{
		Mahindra obj=new Mahindra();
		System.out.println(obj.carname);
		obj.mycar();
	}
}
```

Output:
```
Mahindra
This is my car
```

![image](https://github.com/user-attachments/assets/a9fde929-595d-4663-a6d3-923875025a6f)

![image](https://github.com/user-attachments/assets/28adafb8-cdb7-435e-907e-1770b6220158)

