package p136interface.demo1;

public class AnimalTest {
    public static void main(String[] args) {
        Frog frog = new Frog("Froggy", 1);
        frog.eat();
        frog.swim();

        Dog dog = new Dog("Doggy", 2);
        dog.eat();
        dog.swim();

        Sheep sheep = new Sheep("Sheep", 3);
        sheep.eat();
    }
}
