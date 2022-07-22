package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, contador = 0;

		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("NÚMEROS PARES:");

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
				contador++;
			}
		}

		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + contador);

		sc.close();

	}

}
