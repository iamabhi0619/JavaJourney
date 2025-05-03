@FunctionalInterface
interface MathOperation {
    double compute(double a, double b);
}

public class Task {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println(add.compute(12, 4));
        System.out.println(subtract.compute(12, 4));
        System.out.println(multiply.compute(12, 4));
        System.out.println(divide.compute(12, 4));
    }
}
