package java1;

public class StaticExample {
    static int count = 0;
    public StaticExample() {
        count++;
    }
    static void displayMessage() {
        System.out.println("This is a static method!");
    }
    static {
        System.out.println("Static block executed!");
    }
    static class InnerClass {
        void display() {
            System.out.println("This is a static inner class!");
        }
    }
    public static void main(String[] args) {
        StaticExample.displayMessage();
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        System.out.println("Total objects created: " + StaticExample.count);
        StaticExample.InnerClass innerObj = new StaticExample.InnerClass();
        System.out.println(obj1);
        System.out.println(obj2);
        innerObj.display();
    }
}

