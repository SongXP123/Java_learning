package p135abstract.demo2;

public class AnimalTest {
    public static void main(String[] args) {
        Frog frog = new Frog("Froggy", 1);
        frog.eat();

        Dog dog = new Dog("Doggy", 2);
        dog.eat();

        Sheep sheep = new Sheep("Sheep", 3);
        sheep.eat();
    }
}
