// if we declared a member static member belongs to the class, not the object.
// Shared across all instances of the class.
//Use:-
//Store data common to all objects
//Create utility methods
//Access something without an object

//Static Variable is nothing just a class variable which is access from any instance of the class

class Book {
    String title;
    String author;
    int price;
    static int count = 0;

    Book() {
        this("Default Title", "Default Author", 0);
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0;
        count++;
    }

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        count++;
    }

    void displayInfo() {
        System.out.println("Book info..!!");
        System.out.println("Title:- " + this.title);
        System.out.println("Author:- " + this.author);
        System.out.println("Price:- " + this.price);
    }

    static void displayBookCount() {
        System.out.println("Total Books Created: " + count);
    }
}

public class Static {
    public static void main(String[] args) {

        Book.displayBookCount();

        Book b1 = new Book();
        b1.displayInfo();
        System.out.println("=======================================>" + '\n');

        Book b2 = new Book("Once in a blue Moon", "Abhishek");
        b2.displayInfo();
        System.out.println("=======================================>" + '\n');

        Book b3 = new Book("We Togather", "Anup", 499);
        b3.displayInfo();
        System.out.println("=======================================>" + '\n');

        Book.displayBookCount();
    }
}
