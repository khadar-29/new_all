package java1;

interface Animal {
    void eat();
}

interface Playable {
    void play();
}

class Dog {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog implements Animal, Playable {
    public void eat() {
        System.out.println("Puppy eats food");
    }

    public void play() {
        System.out.println("Puppy plays");
    }
}

public class HybridInheri {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.play();
        puppy.bark();
}
}