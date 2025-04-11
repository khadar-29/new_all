package java1;
class Book {
    String title;
    String author;
    int year;
    Book() {
        title = "Unknown";
        author = "Unknown";
        year = 0;
    }
    Book(String title) {
        this.title = title;
        author = "Unknown";
        year = 0;
    }
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        year = 0;
    }
    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}

public class ConsOverloading {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayDetails();
        System.out.println();
        Book book2 = new Book("Java Programming");
        book2.displayDetails();
        System.out.println();
        Book book3 = new Book("Clean Code", "Robert C. Martin");
        book3.displayDetails();
        System.out.println();
        Book book4 = new Book("Effective Java", "Joshua Bloch", 2008);
        book4.displayDetails();
    }
}