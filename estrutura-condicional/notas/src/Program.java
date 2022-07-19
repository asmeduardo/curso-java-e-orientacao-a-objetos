import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, soma;

		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();

		soma = nota1 + nota2;

		System.out.printf("NOTA FINAL = %.1f%n", soma);

		if (soma >= 60.0) {
			System.out.println("APROVADO!");
		} else {
			System.out.println("REPROVADO!");
		}

		sc.close();

	}

}
