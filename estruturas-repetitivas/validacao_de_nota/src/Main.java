import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double nota1, nota2, media = 0.0;

		System.out.print("Digite a primeira nota:");
		nota1 = sc.nextDouble();

		while (nota1 < 0 || nota1 > 10) {

			System.out.print("Valor invalido! Tente novamente: ");

			nota1 = sc.nextDouble();

		}

		System.out.print("Digite a segunda nota:");
		nota2 = sc.nextDouble();

		while (nota2 < 0 || nota2 > 10) {

			System.out.print("Valor invalido! Tente novamente: ");

			nota2 = sc.nextDouble();

		}

		media = (nota1 + nota2) / 2;

		System.out.printf("MÉDIA = %.2f", media);

		sc.close();

	}

}
