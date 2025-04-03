class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {

    public Student(String name) {
        super(name);
    }

    public void study() {
        System.out.println(name + " is studying.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.display();
        student.study();
    }
}
