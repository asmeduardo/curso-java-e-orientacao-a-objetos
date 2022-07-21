package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		System.out.print("Nome: ");
		student.name = sc.nextLine();
		System.out.print("Primeira nota: ");
		student.nota1 = sc.nextDouble();
		System.out.print("Segunda nota: ");
		student.nota2 = sc.nextDouble();
		System.out.print("Terceira nota: ");
		student.nota3 = sc.nextDouble();

		double notaFinal = student.notaFinal();

		System.out.println();
		System.out.println("NOTA FINAL = " + String.format("%.2f", notaFinal));

		if (student.aprovadoOuReprovado(notaFinal)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println("FALTARAM " + String.format("%.2f", 60 - notaFinal) + " PONTOS");
		}

		sc.close();

	}

}
