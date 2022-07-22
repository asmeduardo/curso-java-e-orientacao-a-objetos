package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, contador = 0;
		double soma = 0, mediaAltura;

		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();

		Pessoa[] vetor = new Pessoa[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			vetor[i] = new Pessoa(nome, idade, altura);
			soma += vetor[i].getAltura();
		}

		for (int i = 0; i < n; i++) {
			if (vetor[i].getIdade() < 16)
				contador++;
		}

		mediaAltura = soma / n;

		System.out.println();
		System.out.printf("Altura média: %.2f%n", mediaAltura);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%", (double) contador / n * 100);

		System.out.println();
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16)
				System.out.println(vetor[i].getNome());
		}

		sc.close();

	}

}
