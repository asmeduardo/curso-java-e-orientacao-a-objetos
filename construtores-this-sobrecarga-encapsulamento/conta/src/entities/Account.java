package entities;

public class Account {

    private int number;
    private String holder;
    private double balance;

    private static final double WITHDRAWAL_TAX = 5.00;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDepositAmount) {
        this.number = number;
        this.holder = holder;
        deposit(initialDepositAmount);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + WITHDRAWAL_TAX;
    }

    public String toString() {
        return "Account "
                + getNumber()
                + ", Holder: "
                + getHolder()
                + ", Balance: $ "
                + String.format("%.2f", getBalance());
    }
}