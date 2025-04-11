package java1;
import java.util.Scanner;

public class operations2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = scanner.nextInt();
        System.out.print("Enter second number: ");
        b = scanner.nextInt();
        System.out.print("Enter third number: ");
        c = scanner.nextInt();

        int sum = a + b + c;
        double average = sum / 3.0;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        int max = a;
        int min = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        System.out.println("Maximum value is: " + max);
        System.out.println("Minimum value is: " + min);

        scanner.close();
    }
}