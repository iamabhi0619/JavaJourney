// A local inner class is a class defined inside a method (or block).
// 🔸 Rules:
// Can only be accessed within the method where it is defined
// Can access final or effectively final variables from the method
// Cannot be static
// Used when you need one-time use logic inside a method

class Book {
    public void getAuthorInfo() {
        class Author {
            void display() {
                System.out.println("Author: J.K. Rowling, Country: UK");
            }
        }
        Author aut = new Author();
        aut.display();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        Book b = new Book();
        b.getAuthorInfo();
    }
}
