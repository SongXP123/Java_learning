package p135abstract.demo2;

public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
        System.out.println("Animal constructor");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal constructor");
    }

    public abstract void eat();
}
