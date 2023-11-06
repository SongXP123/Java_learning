package p124Inheritance;

public class AnimalTest {
    public static void main(String[] args) {

        Ragdoll ragdoll = new Ragdoll();
        ragdoll.eat();
        ragdoll.drink();
        ragdoll.meow();

        System.out.println("========================================");
        Husky h = new Husky();
        h.eat();
        h.breakHome();
    }
}
