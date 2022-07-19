import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Valor por hora: ");
		double valorPorHora = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		double horasTrabalhadas = sc.nextDouble();

		double salario = valorPorHora * horasTrabalhadas;

		System.out.printf("O pagamento para %s deve ser de %.2f", nome, salario);

		sc.close();

	}

}
