package java1;

public class ConsChain {
    private int x;
    private int y;

    public ConsChain() {
        this(10, 20);
        System.out.println(x);
        System.out.println(y);
        System.out.println("Default constructor called.");
    }

    public ConsChain(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Parameterized constructor called with x = " + x + " and y = " + y);
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        ConsChain obj = new ConsChain();
        System.out.println(obj);
    }
}
