package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;

	private final double TAX = 5.0;

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
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
		this.balance -= amount + TAX;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Account ");
		sb.append(number);
		sb.append(", Holder: ");
		sb.append(holder);
		sb.append(", Balance: $ ");
		sb.append(String.format("%.2f", balance));

		return sb.toString();
	}

}
