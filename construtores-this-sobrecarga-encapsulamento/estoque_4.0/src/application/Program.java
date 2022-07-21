package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name;
		double price;
		char option;
		int quantity;

		Product p;

		System.out.println("Enter product data:");
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Price: ");
		price = sc.nextDouble();
		System.out.print("Do you want to register the quantity of the product (Y/N)? ");
		option = sc.next().charAt(0);
		
		if(option == 'Y') {
			System.out.print("Quantity in stock: ");
			quantity = sc.nextInt();
			
			p = new Product(name, price, quantity);
		} else {
			p = new Product(name, price);
		}
		
		p.setName("Computer");
		p.setPrice(800.00);

		System.out.println();
		System.out.println("Product data: " + p);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		p.addProducts(quantity);

		System.out.println();
		System.out.print("Updated data: " + p);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		p.removeProducts(quantity);

		System.out.println();
		System.out.print("Updated data: " + p);

		sc.close();

	}

}
