package p1beginning;

public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void changeName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void changeAge(int age) {
        if (age >= 18 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return this.age;
    }
    public void sleep() {
        System.out.println("Sleep");
    }

    public void eat() {
        System.out.println("Eat");
    }
}
