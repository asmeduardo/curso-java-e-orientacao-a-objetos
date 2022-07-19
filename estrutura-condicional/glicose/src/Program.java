import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String classificacao;
		double glicose;

		System.out.print("Digite a medida da glicose: ");
		glicose = sc.nextDouble();

		if (glicose <= 100.0) {
			classificacao = "normal";
		} else if (glicose <= 140) {
			classificacao = "elevado";
		} else {
			classificacao = "diabetes";
		}

		System.out.println("Classificação: " + classificacao);

		sc.close();

	}

}
