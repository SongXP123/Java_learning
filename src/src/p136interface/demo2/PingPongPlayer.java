package p136interface.demo2;

public class PingPongPlayer extends Player implements English {

    private String name;
    private int age;

    public PingPongPlayer() {
    }

    public PingPongPlayer(String name, int age) {
        super(name, age);
    }
    @Override
    public void study() {
        System.out.println("PingPongPlayer is studying");
    }

    @Override
    public void speak() {
        System.out.println("PingPongPlayer is speaking English");
    }
}
