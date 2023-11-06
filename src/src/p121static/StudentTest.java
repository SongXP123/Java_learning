package p121static;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Zhang San");
        s1.setAge(20);
        s1.setGender("Male");
        Student.teacherName = "My Teacher 2";

        s1.study();
        s1.show();

        Student s2 = new Student();

        Student.teacherName = "My Teacher 3";
        s1.show();
        s2.show();

        show();
    }

    public static void show() {
        System.out.println("Hello World");
    }
}
