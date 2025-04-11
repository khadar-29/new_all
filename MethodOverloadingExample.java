package java1;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
    String add(String a, String b) {
        return a + b;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 5 and 3: " + calc.add(5, 3));
        System.out.println("Sum of 5, 3, and 7: " + calc.add(5, 3, 7));
        System.out.println("Sum of 5.5 and 3.2: " + calc.add(5.5, 3.2));
        System.out.println("Concatenation of 'Hello' and 'World': " + calc.add("Hello", "World"));
    }
}