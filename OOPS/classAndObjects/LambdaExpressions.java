//A lambda is a short, concise way to implement a functional interface.
//Cleaner, more readable code
// Especially useful in Streams, Collections, Event Handling, etc.
// Enables functional programming style in Java

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class LambdaExpressions {
    public static void main(String[] args) {
        Calculator cal = (a, b) -> a - b;
        System.out.println(cal.operate(20, 10));
    }
}
