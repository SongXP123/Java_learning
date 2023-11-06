package p136interface.demo2;

public class BasketballCoach extends Coach {

        public BasketballCoach() {
            System.out.println("BasketballCoach constructor");
        }

        public BasketballCoach(String name, int age) {
            super(name, age);
            System.out.println("BasketballCoach constructor");
        }

        @Override
        public void teach() {
            System.out.println("BasketballCoach is teaching");
        }
}
