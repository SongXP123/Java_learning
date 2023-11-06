package p136interface.demo2;

public abstract class Coach {

    public Coach() {
        System.out.println("Coach constructor");
    }

    public Coach(String name, int age) {
        System.out.println("Coach constructor");
    }

    public abstract void teach();
}
