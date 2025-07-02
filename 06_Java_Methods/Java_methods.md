# Java Methods

- A method is a block of code which only runs when it is called.
- You can pass data, known as parameters, into a method.
- Methods are used to perform certain actions, and they are also known as functions.
- Why use methods? To reuse code: define the code once, and use it many times.


![image](https://github.com/user-attachments/assets/1cbcb559-397f-4589-a157-a7a68c46ac5a)

![image](https://github.com/user-attachments/assets/103ed26d-b373-4d1d-8122-07ba93226e3b)

- A method's execution is seen only when it is called.
- Simple example for a method

```java
class Myclass
{
	//defining a user defined method
	public static void mymethod()
    {
    	System.out.println("This is inside the method");
    }    
    public static void main(String[] args)
    {	
    	System.out.println("This is outside the method");
        
    	//calling the method
        mymethod();
    }  
    
}
```

Output:
```
This is outside the method
This is inside the method
```

