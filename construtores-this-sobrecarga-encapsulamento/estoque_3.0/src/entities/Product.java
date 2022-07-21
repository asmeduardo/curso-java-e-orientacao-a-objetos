package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public Product() {
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(name);
		sb.append(", $ ");
		sb.append(String.format("%.2f", price));
		sb.append(", ");
		sb.append(quantity);
		sb.append(" units, Total: $ ");
		sb.append(String.format("%.2f", totalValueInStock()));

		return sb.toString();
	}
}
