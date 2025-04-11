package java1;
class Animal {
    String name;
    Animal(String name) {
        this.name = name;
        System.out.println("Animal Constructor: " + name);
    }
}
class Dog extends Animal {
    String breed;
    Dog(String name) {
        super(name);
        System.out.println("Dog Constructor: " + name);
    }
    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
        System.out.println("Dog Constructor: " + name + ", Breed: " + breed);
    }
}
public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex");
        System.out.println(dog1);
        Dog dog2 = new Dog("Buddy", "Labrador");
        System.out.println(dog2);

    }
}
