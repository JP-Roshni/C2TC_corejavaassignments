package userdefinedexception_assignment;

import java.util.Scanner;

/**
 * Practical Demonstration class
 * Provides a menu-driven program to simulate banking operations
 * using custom exception handling.
 */
public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create BankAccount object
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        System.out.print("Enter Initial Balance: ");
        double initBalance = sc.nextDouble();

        BankAccount account = new BankAccount(accNum, initBalance);

        int choice;
        do {
            System.out.println("\n=== Banking Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double dep = sc.nextDouble();
                        account.deposit(dep);
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double wdr = sc.nextDouble();
                        account.withdraw(wdr);
                        break;

                    case 3:
                        account.displayBalance();
                        break;

                    case 4:
                        System.out.println("✅ Exiting Banking System. Thank you!");
                        break;

                    default:
                        System.out.println("❌ Invalid Choice! Please try again.");
                }
            } catch (InvalidAmountException | InsufficientFundsException e) {
                System.out.println("⚠️ Error: " + e.getMessage());
            } finally {
                if (choice != 4) {
                    System.out.println("✔ Operation Completed.\n");
                }
            }

        } while (choice != 4);

        sc.close();
    }
}
