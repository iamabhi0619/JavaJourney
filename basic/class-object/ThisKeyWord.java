
import java.util.Scanner;

class PalindromeChecker {
    private int num;
    public PalindromeChecker(int num) {
        this.num = num;
    }
    public void displayPalindromeCheckResult() {
        int original = num, reversed = 0, remainder;
        while (original != 0) {
            remainder = original % 10;
            reversed = reversed * 10 + remainder;
            original /= 10;
        }
        if (num == reversed) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is not a Palindrome");
        }
    }
}

public class ThisKeyWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();

        PalindromeChecker palindromeChecker = new PalindromeChecker(inputNumber);

        palindromeChecker.displayPalindromeCheckResult();

        scanner.close();
    }
}
