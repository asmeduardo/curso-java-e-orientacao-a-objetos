import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n, x, y;

		System.out.print("Quantos casos você vai digitar? ");
		n = in.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.print("Entre com o numerador: ");
			x = in.nextInt();
			System.out.print("Entre com o numerador: ");
			y = in.nextInt();

			if (y == 0) {

				System.out.println("DIVISÃO IMPOSSÍVEL");

			} else {

				System.out.printf("DIVISÃO = %.2f%n", (double) x / y);

			}

		}

		in.close();

	}

}
