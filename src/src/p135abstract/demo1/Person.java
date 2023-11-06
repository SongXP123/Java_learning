package p135abstract.demo1;

public abstract class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Person constructor");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void work();

    public void sleep() {
        System.out.println("Sleeping");
    }

    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }


}
