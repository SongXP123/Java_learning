package p124Inheritance;

public class Animal {
    private String name;
    private int age;

    public Animal() {
        this.name = "Animal";
        this.age = 0;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void drink() {
        System.out.println("Animal is drinking");
    }
}
