package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double soma = 0.0, media;

		System.out.print("Quantas alturas serão digitadas? ");
		n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {

			vetor[i] = sc.nextDouble();
			soma += vetor[i];

		}

		media = soma / n;

		System.out.println();
		System.out.printf("Média das alturas digitadas: %.2f", media);

		sc.close();

	}

}
