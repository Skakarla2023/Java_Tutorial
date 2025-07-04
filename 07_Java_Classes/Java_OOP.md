![image](https://github.com/user-attachments/assets/a43bbf08-a5e7-4870-aa7b-5199083c7c79)

![image](https://github.com/user-attachments/assets/818066af-a7b2-4655-b257-5d66df17cfdc)

- So, a class is a template for objects, and an object is an instance of a class.
- When the individual objects are created, they inherit all the variables and methods from the class.

![image](https://github.com/user-attachments/assets/036cf4d2-6e8f-486d-90f9-32fedd3ab70c)

![image](https://github.com/user-attachments/assets/33713c53-20d2-4b6d-ace8-a0f810128232)

```java
public class Main
{
	int x=5,y=10;
    
    public static void main(String[] args)
    {
    
    	Main obj1=new Main();
        Main obj2=new Main();
        
        System.out.println(obj1.x);
        System.out.println(obj2.y);
        
    }
}
```

Output:
```
5
10
```

![image](https://github.com/user-attachments/assets/19e49c33-88fe-44af-a705-997daa140a19)

### Java Class Attributes

- In the previous chapter, we used the term "variable" for x in the example (as shown below). It is actually an attribute of the class. Or you could say that class attributes are variables within a class.
- Another term for class attributes is fields.
- You can access attributes by creating an object of the class, and by using the dot syntax (.).

![image](https://github.com/user-attachments/assets/53809437-68e4-467c-af81-0b1d4d65a0e6)

![image](https://github.com/user-attachments/assets/456f20ab-7a25-45c3-a287-88ce6aa2b43d)

```java
public class Main
{
    int x=5;
    public static void main(String[] args)
    {
        Main obj=new Main();
        obj.x=10;
        System.out.println(obj.x);
    }
}
```

Output:
```
10
```

- The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).

### Java Class Methods

```java
class Main
{
    static void mymethod()
    {
        System.out.println("This is my method.");
    }
    
    public static void main(String[] args)
    {
        mymethod();
    }
}
```

Output:
```
This is my method.
```

### Static vs. Public

You will often see Java programs that have either static or public attributes and methods.

In the example above, we created a static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects.

```java
class Myclass
{
	static void method1()
    {
    	System.out.println("Static methods can be called by using classname.");
    }
    
    public void method2()
    {
    	System.out.println("Public methods are called by using objects.");
    }
    
    public static void main(String[] args)
    {
    	method1();					//calling static method
        
        Myclass myobj=new Myclass();
        myobj.method2();			//calling public method using object
    }
 }
```

Output:
```
Static methods can be called by using classname.
Public methods are called by using objects.
```

![image](https://github.com/user-attachments/assets/c341899c-fc93-4fec-8be4-9a2b75c52250)

![image](https://github.com/user-attachments/assets/1a4a63e2-843f-45f5-a842-fa666541e0a3)

```java
class Main
{
	int x;
    
    public Main()
    {
    	x=100;
    }
    
    public static void main(String[] args)
    {
    	Main myobj=new Main();
        System.out.println(myobj.x);
    }
}
```

Output:
```
100
```

![image](https://github.com/user-attachments/assets/326cec3c-053b-4160-afe4-0296aeca6eaa)

```java
public class Main 
{
  int x;

  public Main(int y) 
  {
    x = y;
  }

  public static void main(String[] args) 
  {
    Main myObj = new Main(5);
    System.out.println(myObj.x);
  }
  
}
```

Output:
```
5
```

You can have as many parameters as you want.

