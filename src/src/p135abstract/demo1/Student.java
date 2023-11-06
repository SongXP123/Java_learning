package p135abstract.demo1;

public class Student extends Person {

    public Student() {
        System.out.println("Student constructor");
    }

    public Student(String name, int age) {
        super(name, age);
    }
    @Override
    public void work() {
        System.out.println("Student is studying");
    }
}
