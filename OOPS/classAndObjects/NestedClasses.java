//A nested class is a class defined inside another class.
// There are 4 types of nested classes:
// Static Nested Class
// Inner Class (Non-static nested class)
// Local Inner Class
// Anonymous Inner Class


//Non-static

class Laptop {
    class Processor {
        public void showDetails() {
            System.out.println("Intel i7, 10th Gen, 2.6GHz");
        }
    }
}

public class NestedClasses {
    public static void main(String[] args) {
        Laptop lap = new Laptop();

        Laptop.Processor pro = lap.new Processor();

        pro.showDetails();
    }
}
