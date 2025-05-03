
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age:- ");
        int age = sc.nextInt();
        System.out.println("Entered age= " + age);
        sc.close();
    }
}
