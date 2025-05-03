public class ThrowThrows {
    public static boolean validateAge(int a) {
        if (a < 18) {
            throw new IllegalArgumentException("Age should be 18+");
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            boolean isValid = validateAge(20);
            if (isValid) {
                System.out.println("Access Granted");
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        try {
            boolean isValid = validateAge(14);
            if (isValid) {
                System.out.println("Access Granted");
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
