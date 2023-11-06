package p135abstract.demo2;

public class Frog extends Animal {

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
}
