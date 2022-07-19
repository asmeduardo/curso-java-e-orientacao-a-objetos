import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;

		System.out.print("Digite o valor do raio do circulo: ");
		double raio = sc.nextDouble();

		double area = pi * raio * raio;

		System.out.printf("AREA = %.3f", area);

		sc.close();

	}

}
