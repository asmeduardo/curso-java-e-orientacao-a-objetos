import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, soma, contador;

		System.out.print("Digite um número inteiro: ");
		x = sc.nextInt();

		while (x != 0) {
			soma = 0;
			contador = 0;

			if (x % 2 == 0) {

				while (contador < 5) {

					soma += x;

					contador++;
					x += 2;

				}

				System.out.println("SOMA = " + soma);

			} else {
				x++;

				while (contador < 5) {

					soma += x;

					contador++;
					x += 2;

				}

				System.out.println("SOMA = " + soma);

			}

			System.out.print("Digite um número inteiro: ");
			x = sc.nextInt();

		}

		sc.close();

	}

}
