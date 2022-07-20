import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y, soma = 0;

		System.out.println("Digite dois números: ");
		x = sc.nextInt();
		y = sc.nextInt();

		if (x > y) {

			int troca;

			troca = x;

			x = y;
			y = troca;

		}

		for (int i = x + 1; i < y; i++) {

			if (i % 2 != 0) {

				soma += i;

				i++;

			} else {

				i++;

				soma += i;

			}

		}

		System.out.println("SOMA DOS ÍMPARES = " + soma);

		sc.close();

	}

}
