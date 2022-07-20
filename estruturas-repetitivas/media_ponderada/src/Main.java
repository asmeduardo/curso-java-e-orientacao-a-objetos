import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n;
		double a, b, c, media;

		System.out.print("Quantos casos você vai digitar? ");
		n = in.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Digite três números:");
			a = in.nextDouble();
			b = in.nextDouble();
			c = in.nextDouble();

			media = (a * 2 + b * 3 + c * 5) / 10;

			System.out.printf("MEDIA = %.1f%n", media);

		}

		in.close();

	}

}
