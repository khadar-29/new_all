package java1;
import java.util.Scanner;
public class operations {
    public static void main(String[]args){
        int a,b;
        Scanner scanner= new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Sum : "+(a+b));
        System.out.println("Average : "+(a+b)/2);
        if (a>b) {
            System.out.println("Maximum value is : "+a);
            System.out.println("Minimum value is : "+b);
        }
        else{
            System.out.println("Maximum value is : "+b);
            System.out.println("Minimum value is : "+a);
        }
    }
}
