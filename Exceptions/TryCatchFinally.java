public class TryCatchFinally {

    public static void division(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException:- " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error" + e.getMessage());
        } finally {
            System.out.println("Division Complete");
        }
    }

    public static void main(String[] args) {
        division(10, 5);
        division(10, 0);
    }
}
