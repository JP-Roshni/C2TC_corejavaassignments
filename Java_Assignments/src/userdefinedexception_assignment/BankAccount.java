package userdefinedexception_assignment;

/**
 * BankAccount class represents a bank account with account number and balance.
 * Provides methods for deposit, withdraw, and displaying balance.
 * Uses user-defined exceptions to handle invalid operations.
 */
public class BankAccount {
    private int accountNumber;
    private double balance;

    // Parameterized constructor
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method with exception handling
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero.");
        }
        balance += amount;
        System.out.println("✅ Deposited: " + amount + " | New Balance: " + balance);
    }

    // Withdraw method with exception handling
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance! Available: " + balance);
        }
        balance -= amount;
        System.out.println("✅ Withdrawn: " + amount + " | Remaining Balance: " + balance);
    }

    // Display balance
    public void displayBalance() {
        System.out.println("💳 Account Number: " + accountNumber + " | Current Balance: " + balance);
    }
}
