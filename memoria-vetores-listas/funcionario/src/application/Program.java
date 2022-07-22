package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		boolean contem = false;

		List<Funcionario> list = new ArrayList<>();

		System.out.print("Quantos funcionários você vai registrar? ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Funcionário #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();

			list.add(new Funcionario(id, nome, salario));
		}

		System.out.println();
		System.out.print("Entre com o id do funcionário que terá o salário aumentado: ");
		int id = sc.nextInt();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				System.out.print("Entre com a porcentagem: ");
				double porcentagem = sc.nextDouble();

				list.get(i).aumentarSalario(porcentagem);

				contem = true;
			}
		}

		if (!contem)
			System.out.println("Este id não existe!");

		System.out.println();
		System.out.println("Lista de funcionários:");

		for (Funcionario f : list) {
			System.out.println(f.getId() + ", " + f.getNome() + ", " + String.format("%.2f", f.getSalario()));
		}

		sc.close();

	}

}
