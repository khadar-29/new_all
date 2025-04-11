package java1;
import java.util.Scanner;
class Students {
    String name;
    Scanner scanner = new Scanner(System.in);
    public Students(String name) {

        System.out.println("Enter the name : ");
        name = scanner.toString();
    }

    public void display(){
        System.out.println("name : "+name);

    }
    public void study() {
        System.out.println(name + " is studying.");
    }
}

public class inheri{
    public static void main(String[] args) {

        Students student = new Students("John");
        Students student1 = new Students("Johncena");

        student.display();
        student.study();
        student1.display();
        student1.study();
    }
}
