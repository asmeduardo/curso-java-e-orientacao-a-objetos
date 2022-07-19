import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Base do retangulo: ");
		double base = sc.nextDouble();
		System.out.print("Altura do retangulo: ");
		double altura = sc.nextDouble();
		
		double area = base * altura;
		double perimetro = base * 2.0 + altura * 2.0;
		double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		
		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		
		sc.close();
	}

}
