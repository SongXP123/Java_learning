package p135abstract.demo2;

public class Dog extends Animal {

    public Dog() {
        System.out.println("Dog constructor");
    }

    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("Dog is eating meat");
    }
}
