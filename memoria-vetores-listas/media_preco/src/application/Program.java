package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto produto;

		int n;
		double soma = 0.0, mediaPrecos;

		System.out.print("Quantos produtos serão digitados? ");
		n = sc.nextInt();

		Produto[] produtos = new Produto[n];

		for (int i = 0; i < n; i++) {

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço do produto: ");
			double preco = sc.nextDouble();

			produtos[i] = new Produto(nome, preco);;
			soma += produtos[i].getPreco();

		}

		mediaPrecos = soma / n;

		System.out.println();
		System.out.printf("Média de preço dos produtos digitados: %.2f%n", mediaPrecos);

		sc.close();

	}

}
