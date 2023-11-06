package p136interface.demo1;

public class Frog extends Animal implements Swim {

    public Frog() {
        System.out.println("Frog constructor");
    }

    public Frog(String name, int age) {
        super(name, age);
        System.out.println("Frog constructor");
    }

    @Override
    public void eat() {
        System.out.println("Frog is eating insects");
    }

    @Override
    public void swim() {
        System.out.println("Frog is swimming");
    }
}
