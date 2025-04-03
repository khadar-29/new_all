
class Students extends Person {

    public Students(String name) {

        super(name);
    }

    public void study() {
        System.out.println(name + " is studying.");
    }
}

public class inheri{
    public static void main(String[] args) {

        Student student = new Student("John");
        Student student1 = new Student("Johncena");

        
        student1.display();
        student1.study();
    }
}
