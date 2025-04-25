// Demonstrating the use of 'this' keyword and constructor chaining
// 'this' keyword is used to:
// 1. Resolve name conflicts between class fields and parameters.
// 2. Call another constructor within the same class (constructor chaining).

class Book {
    // Instance variables to store book details
    String title; // Title of the book
    String author; // Author of the book
    int price; // Price of the book

    // Default constructor
    Book() {
        // Calls the constructor with three parameters using 'this'
        this("Default Title", "Default Author", 0);
    }

    // Constructor with title and author
    Book(String title, String author) {
        // Resolves name conflict using 'this' and initializes price to 0
        this.title = title;
        this.author = author;
        this.price = 0;
    }

    // Constructor with title, author, and price
    Book(String title, String author, int price) {
        // Resolves name conflict using 'this' and initializes all fields
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book information
    void displayInfo() {
        System.out.println("Book info..!!");
        System.out.println("Title:- " + this.title); // 'this' refers to the current object's title
        System.out.println("Author:- " + this.author); // 'this' refers to the current object's author
        System.out.println("Price:- " + this.price); // 'this' refers to the current object's price
    }
}

public class ThisConstructorChaining {
    public static void main(String[] args) {
        // Create a book using the default constructor
        Book b1 = new Book();
        b1.displayInfo(); // Display default book info
        System.out.println("=======================================>" + '\n');

        // Create a book using the constructor with title and author
        Book b2 = new Book("Once in a blue Moon", "Abhishek");
        b2.displayInfo(); // Display book info with title and author
        System.out.println("=======================================>" + '\n');

        // Create a book using the constructor with title, author, and price
        Book b3 = new Book("We Togather", "Anup", 499);
        b3.displayInfo(); // Display book info with all details
        System.out.println("=======================================>" + '\n');
    }
}