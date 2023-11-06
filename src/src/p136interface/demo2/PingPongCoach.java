package p136interface.demo2;

public class PingPongCoach extends Coach implements English {

    @Override
    public void teach() {
        System.out.println("PingPongCoach is teaching");
    }

    @Override
    public void speak() {
        System.out.println("PingPongCoach is speaking English");
    }
}
