import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int porcentagem;
		double salario, salarioComAumento, aumento;

		System.out.print("Digite o salário da pessoa: ");
		salario = sc.nextDouble();

		if (salario <= 1000.0) {
			porcentagem = 20;
			aumento = salario * porcentagem / 100;
			salarioComAumento = salario + aumento;
		} else if (salario <= 3000.0) {
			porcentagem = 15;
			aumento = salario * porcentagem / 100;
			salarioComAumento = salario + aumento;
		} else if (salario <= 8000.0) {
			porcentagem = 10;
			aumento = salario * porcentagem / 100;
			salarioComAumento = salario + aumento;
		} else {
			porcentagem = 5;
			aumento = salario * porcentagem / 100;
			salarioComAumento = salario + aumento;
		}

		System.out.printf("Novo salario = R$ %.2f\n", salarioComAumento);
		System.out.printf("Aumento = R$ %.2f\n", aumento);
		System.out.printf("Porcentagem = %d %%\n", porcentagem);

		sc.close();

	}

}
