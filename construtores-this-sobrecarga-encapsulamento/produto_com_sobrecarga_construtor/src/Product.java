public class Product {

    public String name;
    public double price;
    public int quantity;

     public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return quantity * price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }

}
