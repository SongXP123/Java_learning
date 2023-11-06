package p136interface.demo2;

public abstract class Player {

    public Player() {
        System.out.println("Player constructor");
    }

    public Player(String name, int age) {
        System.out.println("Player constructor");
    }

    public abstract void study();
}
