import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a medida A: ");
		double medidaA = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		double medidaB = sc.nextDouble();
		System.out.print("Digite a medida C: ");
		double medidaC = sc.nextDouble();

		double areaDoQuadrado = medidaA * medidaA;
		double areaDoTriangulo = medidaA * medidaB / 2.0;
		double areaTrapezio = (medidaA + medidaB) * medidaC / 2.0;

		System.out.printf("AREA DO QUADRADO = %.4f%n", areaDoQuadrado);
		System.out.printf("AREA DO TRIANGULO = %.4f%n", areaDoTriangulo);
		System.out.printf("AREA DO TRAPEZIO = %.4f%n", areaTrapezio);

		sc.close();

	}

}
