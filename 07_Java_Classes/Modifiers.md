![image](https://github.com/user-attachments/assets/e0c7d4bf-1270-4892-a5a0-d1318f9aac61)

![image](https://github.com/user-attachments/assets/994a0994-f98f-48ee-94ee-13961fac81d3)

![image](https://github.com/user-attachments/assets/8ae380d3-6359-4a2a-b3ae-f1ecf8d8d2f9)

![image](https://github.com/user-attachments/assets/767be69b-60b5-47b1-9101-d1b32e4bf2fa)

![image](https://github.com/user-attachments/assets/0272e775-6c80-4f8f-9d61-d104c8d2d050)


```java
public class Main
{
	final int a=10;
    final String me="me";
    
    public static void main(String[] args)
    {
    	Main myobj=new Main();
        myobj.a=5;
        myobj.me="myself";
        
        System.out.println(myobj.a);
        System.out.println(myobj.me);
    }
}
```

Output:
```
Main.java:9: error: cannot assign a value to final variable a
        myobj.a=5;
             ^
Main.java:10: error: cannot assign a value to final variable me
        myobj.me="myself";
             ^
2 errors
```

![image](https://github.com/user-attachments/assets/d77fc2e8-d84e-4848-ae93-8d4fdc27a909)


```java
public class Main
{
	static void print_method()
    {
   		System.out.println("This is a static method");
    }
    
    public void mymethod()
    {
    	System.out.println("This is a public method");
    }
    
    public static void main(String[] args)
    {
    	Main myobj=new Main();
        myobj.mymethod();	//calling a public method using the object of our class.
        
        print_method();		//calling a static method.
    }
}
```

Output:
```
This is a public method
This is a static method
```

![image](https://github.com/user-attachments/assets/0f61d764-55d4-4253-8e3c-cfe764eb1e40)

```java

// First.java

package com.skakarla.java_Programs;

abstract class First 
{
	public String name="John";
	public int num=10;
	abstract void mymethod();
}

//MyFirst.java

package com.skakarla.java_Programs;

public class MyFirst extends First
{
	void mymethod() 
	{
		System.out.println("This is an abstract method");		
	}
}

//Second.java

package com.skakarla.java_Programs;

public class Second 
{
	public static void main(String[] args)
	{
		MyFirst obj=new MyFirst();
		System.out.println("Name:"+obj.name);
		System.out.println("Age:"+obj.num);
		obj.mymethod();
	}
	
}
```

Output:
```
Name:John
Age:10
This is an abstract method
```

## Java Encapsulation

![image](https://github.com/user-attachments/assets/ef058f2b-27cd-4e73-9ff2-59bfdb08127a)

![image](https://github.com/user-attachments/assets/138a08ac-9bac-42bf-b89e-aa16ce480928)

![image](https://github.com/user-attachments/assets/e82cb22c-2f9e-460d-af21-88a9bf2e60f5)

![image](https://github.com/user-attachments/assets/295882c5-5a2c-467c-ad8a-4c4d85a123e7)

```java

//Person.java

package com.skakarla.java_Programs;

public class Person 
{
	private int num;
	private String name;
	
	public String getName()
	{
		return name;
	}
	
	public int getNum()
	{
		return num;
	}
	
	public String setName(String newName)
	{
		return this.name=newName;
	}
	
	public int setNum(int newNum)
	{
		return this.num=newNum;
	}
}

//MyClass.java

package com.skakarla.java_Programs;

public class MyClass 
{
	public static void main(String[] args) 
	{

		Person obj=new Person();
		obj.setName("Balaji");
		obj.setNum(100);
		
		System.out.println("Name:"+obj.getName());
		System.out.println("Number:"+obj.getNum());
		
	}

}

```

![image](https://github.com/user-attachments/assets/90ceca79-4f77-4c3a-970e-ba809c893f33)

