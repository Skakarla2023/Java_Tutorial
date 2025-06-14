package g;
import java.lang.*;
 
class Vysh
{
 public static void main(String[] args)
 {
     Student s1=new Student();
     Student s2=new Student("Reshma",192);
     s1.display();
     s2.display();
 }
}

  class Student
{
    private String name;
    private int id;
 
    Student()
    {
        name="Vyshnavi";
        id=21;
    }
    Student(String name,int id)
    {
       this.name=name;
       this.id=id;
    
    }
    public void display()
    {
        System.out.println("name:"+name);
        System.out.println("id:"+id);
     }
}
     