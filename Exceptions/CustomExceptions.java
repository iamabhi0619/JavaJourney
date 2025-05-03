
import java.util.Scanner;

class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

public class CustomExceptions {
    public static void main(String[] args) {
        int balance = 10000;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the amount to withdraw");
            int amt = sc.nextInt();
            if (amt > balance) {
                throw new LowBalanceException("Insufficient fund");
            }
            balance -= amt;
            System.out.println("Withdrawal successful.!" + balance);
        } catch (LowBalanceException e) {
            System.err.println(e.getClass() + " " + e.getMessage());
        }
    }
}
