class BankAccount {

    private String owner;
    private double balance;

    // Constructor
    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    // Getters
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit completed: $" + amount);
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal completed: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Display account information
    public void displayAccount() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: $" + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating the object
        BankAccount account1 = new BankAccount("Eduardo", 1000);

        System.out.println("Initial Account Information:");
        account1.displayAccount();

        System.out.println("\nPerforming Transactions:");
        account1.deposit(500);
        account1.withdraw(300);

        System.out.println("\nFinal Account Information:");
        account1.displayAccount();

        System.out.println("\nAccessing Data Through Getters:");
        System.out.println("Owner: " + account1.getOwner());
        System.out.println("Balance: $" + account1.getBalance());
    }
}