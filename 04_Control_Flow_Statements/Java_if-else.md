# Java If ... Else

![image](https://github.com/user-attachments/assets/97666f3f-b210-427d-964f-2ec2db5ffa16)

![image](https://github.com/user-attachments/assets/ed001284-f738-4766-b938-7ed5aa20a2e4)

```java
public class Main
{
    public static void main(String[] args)
    {
        if(9>3)
        {
            System.out.println("Good evening");
        }
    }
}
```

Output:

```
Good evening
```

![image](https://github.com/user-attachments/assets/b30a6af3-d6b0-48e2-aab6-91417a6cdea1)

![image](https://github.com/user-attachments/assets/9b664263-5155-42b8-ab90-c3b89de11321)

```java
public class Main
{
    public static void main(String[] args)
    {
        if(9<3)
        {
            System.out.println("Good evening");
        }
        else
        {
            System.out.println("Good night");
        }
    }
}
```

Output:
```
Good night
```

![image](https://github.com/user-attachments/assets/886ecdf8-8b39-4083-996b-42b89cc4361f)

![image](https://github.com/user-attachments/assets/a335e42b-17cd-49ff-b1be-f579275241db)

```java
public class Main
{
  public static void main(String[] args)
  {
    int time = 22;
    if (time < 10)
    {
      System.out.println("Good morning.");
    }
    else if (time < 18)
    {
      System.out.println("Good day.");
    }
    else
    {
      System.out.println("Good evening.");
    }
  }
}
```

