
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleThrows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter numerator:- ");
            int a = sc.nextInt();
            System.out.println("Enter Denominator:- ");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException | InputMismatchException e) {
            System.err.println("Error: " + e.getClass() + e.getMessage());
        }

        sc.close();
    }
}
