package p136interface.demo2;

public abstract class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Person constructor");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor");
    }

    public void eat() {
        System.out.println("Person is eating");
    }

    // get and set methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
