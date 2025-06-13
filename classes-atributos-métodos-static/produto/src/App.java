import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        p.name = sc.nextLine();
        System.out.print("Price: ");
        p.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        p.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + p);

        System.out.println();
        System.out.print("Enter the number of the products to be added in stock: ");
        p.addProducts(sc.nextInt());

        System.out.println();
        System.out.println("Update data: " + p);

        System.out.println();
        System.out.print("Enter the number of the products to be removed from stock: ");
        p.removeProducts(sc.nextInt());

        System.out.println();
        System.out.println("Update data: " + p);

        sc.close();
    }
}
