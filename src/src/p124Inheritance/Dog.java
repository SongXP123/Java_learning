package p124Inheritance;

public class Dog extends Animal {
    private String name;
    private int age;

    public Dog() {
        this.name = "Dog";
        this.age = 0;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void drink() {
        System.out.println("Dog is drinking");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}
