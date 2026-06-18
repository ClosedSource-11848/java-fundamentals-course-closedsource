class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void showAccount() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: $" + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Eduardo", 1000);

        account1.showAccount();

        System.out.println("\nUsing getters:");
        System.out.println(account1.getOwner());
        System.out.println(account1.getBalance());
    }
}