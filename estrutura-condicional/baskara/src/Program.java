import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta, x1, x2;

		System.out.print("Coeficiente a: ");
		a = sc.nextDouble();
		System.out.print("Coeficiente b: ");
		b = sc.nextDouble();
		System.out.print("Coeficiente c: ");
		c = sc.nextDouble();

		delta = b * b - 4 * a * c;

		if (delta < 0) {
			System.out.println("Esta equação não possui raízes reais");
		} else {
			x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
			x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

			System.out.printf("X1 = %.4f%n", x1);
			System.out.printf("X2 = %.4f%n", x2);
		}

		sc.close();

	}

}
