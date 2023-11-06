package p136interface.demo2;

public class BasketballPlayer extends Player {

        public BasketballPlayer() {
        }

        public BasketballPlayer(String name, int age) {
            super(name, age);
        }

        @Override
        public void study() {
            System.out.println("BasketballPlayer is studying");
        }
}
