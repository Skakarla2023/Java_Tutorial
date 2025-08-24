# Java Variables

![image](https://github.com/user-attachments/assets/7d97d555-d286-4728-b8bb-cb6811cfdd2a)

![image](https://github.com/user-attachments/assets/2545b44b-6d93-4b58-9358-3263843907fa)

- If you assign a value to the variable which is already decalred, it means that you are overwriting the variable value.
- If you do not want to change the value of the variable after it is assigned, declare the variable using the **final** keyword.

![image](https://github.com/user-attachments/assets/12aff6aa-2733-4708-8740-d22d647a3884)

![image](https://github.com/user-attachments/assets/beabc0a4-f86f-4b2e-ae59-006a5ca81a3e)

- To make the variable names more understandable,for practical use of variable names, observe the following code:

```java

class Main {
    public static void main(String[] args) {
        int studentId=100;
        char studentgrade='A';
        String studentname="Devara";
        double studentcgpa=9.4;
        
        System.out.println("Student name:"+studentname);
        System.out.println("Student Id:"+studentId);
        System.out.println("Student CGPA:"+studentcgpa);
        System.out.println("Student grade:"+studentgrade);
    }
}
```

## Java Datatypes

- There are two kinds of datatypes in java.They are:

  - Primitive Data Types
  - Non-Primitive Data Types

### Primitive Data types

- Primitive data types are fundamental building blocks that directly store simple values. They are predefined by the Java language and have a fixed size and range of values.

  - Integer Types:
    - byte: 8-bit signed integer.
    - short: 16-bit signed integer.
    - int: 32-bit signed integer (most commonly used).
    - long: 64-bit signed integer.
  - Floating-Point Types:
    - float: 32-bit single-precision floating-point number.
    - double: 64-bit double-precision floating-point number (most commonly used for decimals).
  - Character Type:
    - char: 16-bit Unicode character.
  - Boolean Type:
    - boolean: Represents a truth value, either true or false.

### Non-primitive Data types

- Non-primitive data types are more complex and are used to store references to objects. They are not predefined by the language but are created by the programmer or provided by the Java API. Non-primitive types can be null, meaning they don't refer to any object.

  - Classes: User-defined blueprints for creating objects.

    ```Java
    class MyClass {
        // ...
    }
    ```
    
  - Interfaces: Blueprints of a class, defining a set of methods that a class must implement.

    ```Java
    interface MyInterface {
        // ...
    }
    ```
  - Arrays: Ordered collections of elements of the same data type.

  ```Java
    int[] numbers = {1, 2, 3};
  ```

  - Strings: Sequences of characters (a special class in Java).

  ```Java
    String name = "Java";
  ```

  - Enums: Special classes representing a group of constants.

```Java
    enum Day {
        MONDAY, TUESDAY
    }
```


![image](https://github.com/user-attachments/assets/2c246fbe-fbc7-4d98-a287-eda9d57292e5)

![image](https://github.com/user-attachments/assets/4f0801df-2877-44a8-bec0-71a1ecc3bcc1)


```java
class Main
{  
    public static void main(String[] args)
    {
        int myint=5;
        double mydouble=myint;          //widening casting
        
        System.out.println(myint);
        System.out.println(mydouble);
        
        double num=3.44;
        int mynum=(int)num;
        
        System.out.println(num);
        System.out.println(mynum);      //narrowing casting
    }
}
```

### Java Operators

![image](https://github.com/user-attachments/assets/963bcf75-8ea2-465b-b6ed-6bc800cf7a50)



