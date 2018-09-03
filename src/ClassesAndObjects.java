public class ClassesAndObjects {
    public static void main(String[] args)
    {
        Person person1 = new Person();

        person1.setName("Alex new");
        person1.setAge(-100);
        System.out.println(person1.getName());
        person1.speak();
        person1.sayHello();

    }
}

class Person
{
    private String name;
    private int age;

    public void setName(String username)
    {
        if(username.isEmpty())
        {
            System.out.println("Empty name");
        }
        else name = username;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int userAge)
    {
        if(userAge < 1)
        {
            System.out.println("Not valid age");
        }
        else
            age = userAge;
    }

    public int getAge()
    {
        return age;
    }


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
