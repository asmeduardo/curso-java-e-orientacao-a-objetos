import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char tipoEscala;
		double temperatura, cParaF, fParaC;

		System.out.print("Você vai digitar a temperatura em qual escala (C/F)? ");
		tipoEscala = sc.next().charAt(0);

		if (tipoEscala == 'C') {
			System.out.print("Digite a temperatura em Celsius: ");
			temperatura = sc.nextDouble();

			cParaF = temperatura * 1.80 + 32;

			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n", cParaF);
		} else {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			temperatura = sc.nextDouble();

			fParaC = (temperatura - 32) / 1.80;

			System.out.printf("Temperatura equivalente em Celsius: %.2f%n", fParaC);
		}

		sc.close();

	}

}
