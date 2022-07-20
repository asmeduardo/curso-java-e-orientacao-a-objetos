import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n, f = 1;

		System.out.print("Digite o valor de N: ");
		n = in.nextInt();

		if (n >= 0) {

			for (int i = 1; i <= n; i++) {

				f = f * i;

			}

			System.out.println("FATORIAL = " + f);

		} else {

			System.out.println("Informe números a partir de zero");

		}

		in.close();

	}

}
