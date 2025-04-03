package java1;

public class newjava {
    String name;

    public newjava(String name) {
        this.name = name;
    }

    // Method to display the name
    public void showName() {
        System.out.println("Animal name: " + name);
    }
}

// Child class
class Dog extends newjava {

    // Constructor
    public Dog(String name) {
        super(name); // Calls the parent class constructor
    }

    // Method specific to Dog
    public void bark() {
        System.out.println(name + " says woof!");
    }
}

public class Main{
    public static void main(String[] args) {
        // Creating a Dog object
        Dog dog = new Dog("Rex");
        dog.showName();  // Calls the method from Animal class
        dog.bark();      // Calls the method from Dog class
    }

}