import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcao, qtdAlcool = 0, qtdGasolina = 0, qtdDisel = 0;

		System.out.print("Informe um código (1, 2, 3) ou 4 para parrar: ");
		opcao = sc.nextInt();

		while (opcao != 4) {

			while (opcao < 1 || opcao > 4) {

				System.out.print("Informe um código (1, 2, 3) ou 4 para parrar: ");
				opcao = sc.nextInt();

			}

			if (opcao == 1)
				qtdAlcool++;
			if (opcao == 2)
				qtdGasolina++;
			if (opcao == 3)
				qtdDisel++;

			System.out.print("Informe um código (1, 2, 3) ou 4 para parrar: ");
			opcao = sc.nextInt();

		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + qtdAlcool);
		System.out.println("Gasolina: " + qtdGasolina);
		System.out.println("Disel: " + qtdDisel);

		sc.close();

	}

}
