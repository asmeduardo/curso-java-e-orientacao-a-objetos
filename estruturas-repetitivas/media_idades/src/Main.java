import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int idade, soma = 0, contador = 0;

		System.out.println("Digite as idades:");
		idade = sc.nextInt();

		while (idade > 0) {

			soma += idade;
			contador++;

			idade = sc.nextInt();

		}

		System.out.printf(idade < 0 && contador == 0 ? "IMPOSSÍVEL CALCULAR%n" : "MÉDIA = %.2f%n",
				(double) soma / contador);

		sc.close();

	}
}
