public class ClassesAndObjects {
    public static void main(String[] args)
    {
        Person person1 = new Person();
        person1.name = "Alex";
        person1.age = 30;
        person1.speak();
        person1.sayHello();

    }
}

class Person
{
    String name;
    int age;

    void speak()
    {
        for (int i = 0; i<3; i++)
        {
            System.out.println("My name is " + name + ", I'm " + age + " old");
        }

    }
    void sayHello()
    {
        System.out.println("Hello!");
    }
}
