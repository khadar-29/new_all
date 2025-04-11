package java1;
class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
public class ThisExample {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        student.display();
    }
}