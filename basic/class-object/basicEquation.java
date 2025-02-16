
import java.util.Scanner;

class Equation {

    Scanner sc = new Scanner(System.in);
    double a, b, c;

    public void inputCoefficients() {
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
    }

    public void solveEquation() {
        double x = (c - b) / a;
        double y = (c - a) / b;
        System.out.printf(a == 0 ? "a is zero" : "x = %.1f", x);
        System.out.println();
        System.out.printf(b == 0 ? "b is zero" : "y = %.1f", y);
    }
}

public class basicEquation {

    public static void main(String[] args) {
        Equation equation = new Equation();
        equation.inputCoefficients();
        equation.solveEquation();
    }
}
