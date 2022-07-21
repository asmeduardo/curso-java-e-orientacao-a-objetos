package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rec = new Rectangle();

		System.out.println("Entre com a largura e a altura do ratângulo:");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();

		System.out.println("AREA = " + rec.area());
		System.out.println("PERIMETRO = " + rec.perimeter());
		System.out.println("DIAGONAL = " + rec.diagonal());

		sc.close();

	}

}
