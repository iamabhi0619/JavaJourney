class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getter
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
            return;
        }
        this.balance += amount;
        System.out.println("Amount Deposited successfully...!");
    }

    void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance..!");
            return;
        }
        balance -= amount;
        System.out.println(amount + "withdraw successfully");
    }

    void displayAccountInfo() {
        System.out.println("Account Info..!");
        System.out.println("A/C Number:- " + accountNumber);
        System.out.println("Name:- " + accountHolderName);
        System.out.println("Balance:- " + balance);
    }

}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(112232, "Abhishek Kumar", 20000);
        b1.displayAccountInfo();

        b1.deposit(20000);
        b1.getBalance();
        b1.getAccountHolderName();
        b1.getAccountNumber();

        b1.withdraw(35000);
        b1.getBalance();

        b1.withdraw(10000);

        b1.displayAccountInfo();
    }
}
