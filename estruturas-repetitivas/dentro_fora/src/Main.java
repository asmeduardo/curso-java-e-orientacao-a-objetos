import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n, x, noIntervalo = 0, foraDoIntervalo = 0;

		System.out.print("Quantos números você vai digitar? ");
		n = in.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.print("Digite um número: ");
			x = in.nextInt();

			if (x >= 10 && x <= 20)
				noIntervalo++;
			if (x < 10 || x > 20)
				foraDoIntervalo++;

		}

		System.out.println(noIntervalo + " DENTRO");
		System.out.println(foraDoIntervalo + " FORA");

		in.close();

	}

}
