// An interface that contains exactly one abstract method
// ➕ It can contain default or static methods too.

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Calculator cal = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println(cal.operate(10, 20));
    }
}
