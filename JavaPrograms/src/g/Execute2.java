package g;


class Execute2
{
    public static void main(String[] args)
    {
        Animal mydog=new Dog();
        Animal mycat=new Cat();
        
        mydog.sleep();
        mydog.sound();
        
        mycat.sleep();
        mycat.sound();
    }
}
abstract class Animal
{
    abstract void sound();
    public void sleep()
    {
        System.out.println("The Animal is sleeping");
    }
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal
{
    void sound()
    {
        System.out.println("Cat meows");
    }
}

