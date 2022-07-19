import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Distância total percorrida (Km): ");
		int distanciaTotal = sc.nextInt();
		System.out.print("Combustível total gasto: ");
		double combustivelGasto = sc.nextDouble();

		double consumoMedio = distanciaTotal / combustivelGasto;

		System.out.printf("Consumo medio = %.3f", consumoMedio);

		sc.close();

	}

}
