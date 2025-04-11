package java1;

import java.util.Scanner;
public class operations2 {
    public static void main(String[]args){
        int a,b,c;
        Scanner scanner= new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
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
        if (a>c) {
            System.out.println("Maximum value is : "+a);
            System.out.println("Minimum value is : "+c);
        }
        else{
            System.out.println("Maximum value is : "c);
            System.out.println("Minimum value is : "+a);
        }
    }
    Scanner.close();
}

