package java1;
interface Animal {
    void eat();
}
interface Playable {
    void play();
}
class Dog implements Animal, Playable {
    public void eat() {
        System.out.println("Dog eats food");
    }
    public void play() {
        System.out.println("Dog plays");
    }
}
public class MultipleInheri {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.play();
    }
}
