package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p = null;

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Você quer adicionar quantidade ao produto (s/n)? ");
        char addQuantity = sc.next().charAt(0);

        if (addQuantity == 's') {
            System.out.print("Quantity in stock: ");
            int quantity = sc.nextInt();

            p = new Product(name, price, quantity);
        } else {
            p = new Product(name, price);
        }

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
