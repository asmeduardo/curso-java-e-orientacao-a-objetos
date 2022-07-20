import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n, x;

		System.out.print("Quantos números você vai digitar? ");
		n = in.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.print("Digite um número: ");
			x = in.nextInt();

			if (x == 0) {

				System.out.println("NULO");

			} else {

				System.out.print(x % 2 == 0 ? "PAR " : "ÍMPAR ");
				System.out.println(x < 0 ? "NEGATIVO" : "POSITIVO");

			}

		}

		in.close();

	}

}
