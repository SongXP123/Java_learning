package p121static;

public class Student {
    private String name;
    private int age;
    private String gender;
    public static String teacherName = "My Teacher";

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getter
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public String getTeacherName() {
        return teacherName;
    }

    // Setter
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static void setTeacherName(String teacherName) {
        Student.teacherName = teacherName;
    }

    public void study() {
        System.out.println(this.name + " is studying");
    }

    public void show() {
        System.out.println("Student Info:");
        System.out.println("    Name: " + this.name);
        System.out.println("    Age: " + this.age);
        System.out.println("    Gender: " + this.gender);
        System.out.println("    Teacher Name: " + teacherName);
    }
}
