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


