import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n, qtdCobaias, s = 0, r = 0, c = 0, soma = 0;
		char tipoCobaia;

		System.out.print("Quantos casos de teste serão digitados? ");
		n = in.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.print("Quantidade de cobaias: ");
			qtdCobaias = in.nextInt();
			System.out.print("Tipo de cobaia: ");
			tipoCobaia = in.next().charAt(0);

			switch (tipoCobaia) {
			case 'C':
				c += qtdCobaias;
				soma += qtdCobaias;
				break;

			case 'R':
				r += qtdCobaias;
				soma += qtdCobaias;
				break;
			case 'S':
				s += qtdCobaias;
				soma += qtdCobaias;
				break;
			default:

			}
		}

		System.out.println();
		System.out.println("RELATORIO FINAL:");
		System.out.println("Total: " + soma + " cobaias");
		System.out.println("Total de coelhos: " + c);
		System.out.println("Total de ratos: " + r);
		System.out.println("Total de sapos: " + s);
		System.out.printf("Percentual de coelhos: %.2f%n", (double) c / soma * 100);
		System.out.printf("Percentual de ratos: %.2f%n", (double) r / soma * 100);
		System.out.printf("Percentual de sapos: %.2f%n", (double) s / soma * 100);

		in.close();

	}

}
