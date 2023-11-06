package p136interface.demo1;

public class Dog extends Animal implements Swim {

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

    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }
}
