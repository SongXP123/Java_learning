package p135abstract.demo2;

public class Sheep extends Animal {

    public Sheep() {
        System.out.println("Sheep constructor");
    }

    public Sheep(String name, int age) {
        super(name, age);
        System.out.println("Sheep constructor");
    }

    @Override
    public void eat() {
        System.out.println("Sheep is eating grass");
    }
}
