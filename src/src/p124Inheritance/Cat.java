package p124Inheritance;

public class Cat extends Animal {
    private String name;
    private int age;

    public Cat() {
        this.name = "Cat";
        this.age = 0;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Cat is eating");
    }

    public void drink() {
        System.out.println("Cat is drinking");
    }

    public void meow() {
        System.out.println("Cat is meowing");
    }
}
