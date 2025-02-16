
import java.util.Scanner;

class MyClass {
    int x;
    public MyClass(int x) {
        this.x = x;
    }
    public void display() {
        System.out.println("Value of x = " + this.x);
    }
}

class ThisKeyWord2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        MyClass myObj = new MyClass(userInput);
        System.out.print("Value of x = " + myObj.x);

        scanner.close();
    }
}
