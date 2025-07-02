# ⭐Java Method Parameters

![image](https://github.com/user-attachments/assets/7aee91d1-19cd-4f57-8698-cf6bfd466812)

```java
public class Main 
{
  static void myname(String fname)
  {
  	System.out.println(fname+" is my friend");
  }
  public static void main(String[] args)
  {
  	myname("Manaswini");
    myname("Satwika");
  }
}
```

Output:
```
Manaswini is my friend
Satwika is my friend
```

> When a parameter is passed to the method, it is called an argument, So from the above example fname is a parameter and satwika,manaswini are arguments.


### Multiple Parameters

You can have as many parameters as you like:

```java
public class Main {
  static void myMethod(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    myMethod("Liam", 5);
    myMethod("Jenny", 8);
    myMethod("Anja", 31);
  }
}
```

- It is common to use if...else statements inside methods:

```java
public class Main {

  // Create a checkAge() method with an integer parameter called age
  static void checkAge(int age) {

    // If age is less than 18, print "access denied"
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!"); 
      
    // If age is greater than, or equal to, 18, print "access granted"
    } else {
      System.out.println("Access granted - You are old enough!"); 
    }
    
  } 

  public static void main(String[] args) { 
    checkAge(20); // Call the checkAge method and pass along an age of 20
  } 
}
```

Output:
```
Access granted - You are old enough!
```

![image](https://github.com/user-attachments/assets/c85a2b53-54bf-4dce-993a-d08f058d5434)

```java
public class Main
{
	static int sum(int num)
    {
    	return num+5;
    }
    
    public static void main(String[] args)
    {
    	System.out.println("The sum is: "+sum(9));
    }
}
```

Output:
```
The sum is: 14
```

- You can also do like this:store the result of the sum in a variable and print it.

```java
public class Main {
  static int myMethod(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    int z = myMethod(5, 3);
    System.out.println(z);
  }
}
```

Output:
```
8
```

