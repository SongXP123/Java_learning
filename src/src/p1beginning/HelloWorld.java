package p1beginning;

public class HelloWorld {
    public static void main(String[] args) {
        Person p = new Person();
        p.changeName("ABC");
        p.changeAge(1001);
        p.sleep();
    }

    public static void playGame() {
        System.out.println("Play game");
    }
}
