package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double circumference, volume;

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		circumference = Calculator.circumference(radius);

		volume = Calculator.volume(radius);

		System.out.println();
		System.out.printf("Circumference: %.2f%n", circumference);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		sc.close();

	}

}
