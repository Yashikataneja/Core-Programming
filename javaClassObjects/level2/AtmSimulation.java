class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // display current balance
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class AtmSimulation {
    public static void main(String[] args) {
        // Create a bank account
        BankAccount account1 = new BankAccount();
        account1.accountHolder = "Amit Kumar";
        account1.accountNumber = "1234567890";
        account1.balance = 5000.0;

        // Display initial balance
        account1.displayBalance();
        System.out.println("-------------------");

        // Deposit money
        account1.deposit(2000);
        account1.displayBalance();
        System.out.println("-------------------");

        // Withdraw money
        account1.withdraw(3000);
        account1.displayBalance();
        System.out.println("-------------------");

        // Try withdrawing more than balance
        account1.withdraw(5000);
        account1.displayBalance();
    }
}
