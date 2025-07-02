# Java Arrays

![image](https://github.com/user-attachments/assets/edf2e356-7d98-42d7-817f-2fa91ecd4cd0)

![image](https://github.com/user-attachments/assets/e450ef93-e2d0-4efc-94c6-5e5d0842fc87)

![image](https://github.com/user-attachments/assets/1109df14-0a8c-4841-8913-f01380bf167a)

```java
public class Main {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    cars[0] = "Opel";
    System.out.println(cars[0]);
  }
}
```

![image](https://github.com/user-attachments/assets/69671d9f-28de-4a03-a5cf-bc23e8b05625)

![image](https://github.com/user-attachments/assets/8fc677e7-99c9-4b80-9992-a146dbd5452b)

![image](https://github.com/user-attachments/assets/05dbc9e3-2763-4eb1-bb33-00cf14bb6c91)

```java
public class Main {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
      System.out.println(i);
    }    
  }
}
```

Output:
```
Volvo
BMW
Ford
Mazda
```

![image](https://github.com/user-attachments/assets/8e19cdc9-e955-4ebc-93c3-5ec8060df65c)

```java
public class Main 
{
  public static void main(String[] args)
  {
    // An array storing different ages
    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

    float avg, sum = 0;

    // Get the length of the array
    int length = ages.length;

    // Loop through the elements of the array
    for (int age : ages) 
    {
      sum += age;
    }
    
    // Calculate the average by dividing the sum by the length
    avg = sum / length;

    // Print the average
    System.out.println("The average age is: " + avg);
  }
}
```

Output:
```
The average age is: 40.75
```

#### Here's another example

```java
public class Main 
{
  public static void main(String[] args) 
  {
    // An array storing different ages
    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

    // Get the length of the array
    int length = ages.length;
    
    // Create a 'lowest age' variable and assign the first array element of ages to it
    int lowestAge = ages[0];

    // Loop through the elements of the ages array to find the lowest age
    for (int age : ages) 
    {
      // Check if the current age is smaller than the current 'lowest age'
      if (lowestAge > age) 
      {
        // If the smaller age is found, update 'lowest age' with that element
        lowestAge = age;
      }
    }

    // Output the value of the lowest age
    System.out.println("The lowest age in the array is: " + lowestAge);
  }
}
```

Output:
```
The lowest age in the array is: 18
```

![image](https://github.com/user-attachments/assets/0a18d352-e0f3-42c8-b897-81c02ce3c011)

![image](https://github.com/user-attachments/assets/67783b3b-4501-4ce7-b5a1-928258258ff9)

![image](https://github.com/user-attachments/assets/4126e23e-f888-4b74-9a67-023243e86f71)


```java
public class Main
{
  public static void main(String[] args) 
  {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int[] row : myNumbers) 
    {
      for (int i : row) 
      {
        System.out.println(i);
      }
    }
  }
}
```

Output:
```
1
2
3
4
5
6
7
```

