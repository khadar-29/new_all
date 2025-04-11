package java1;

public class newjava {
    String name;

    public newjava(String name) {
        this.name = name;
    }
    
    public void showName() {
        System.out.println("Animal name: " + name);
    }
}

class Dog extends newjava {

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " says woof!");
    }
}

class Main{
    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        dog.showName();
        dog.bark();
    }

}