package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double soma = 0, media;

		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}

		System.out.println();
		System.out.print("VALORES = ");

		for (int i = 0; i < n; i++) {
			System.out.print(vetor[i] + " ");
		}

		media = soma / n;

		System.out.println();
		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("MÉDIA = %.2f%n", media);

		sc.close();

	}

}
