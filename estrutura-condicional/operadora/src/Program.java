import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int minutos;
		double taxa = 2.00, valorAPagar = 50.00;

		System.out.print("Digite a quantidade de minutos: ");
		minutos = sc.nextInt();

		if (minutos > 100) {
			valorAPagar += (minutos - 100) * taxa;
		}

		System.out.printf("Valor a pagar: R$ %.2f%n", valorAPagar);

		sc.close();

	}

}
