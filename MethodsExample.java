package java1;
class Calculator {
    void displayMessage() {
        System.out.println("Welcome to the Calculator!");
    }
    int add(int a, int b) {
        return a + b;
    }
    int multiply(int a, int b) {
        return a * b;
    }
    void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Division result: " + (a / b));
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
public class MethodsExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.displayMessage();
        int sum = calc.add(5, 3);
        System.out.println("Sum: " + sum);
        int product = calc.multiply(4, 2);
        System.out.println("Product: " + product);
        calc.divide(10, 2);
        calc.divide(10, 0);
    }
}