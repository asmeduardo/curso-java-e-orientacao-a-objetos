import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura do terreno: ");
		double largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		System.out.print("Digite o preço do metro quadrado: ");
		double precoMetroQuad = sc.nextDouble();
		
		double areaTerreno = largura * comprimento;
		
		double precoTerreno = areaTerreno * precoMetroQuad;
		
		System.out.printf("Area do terreno: %.2f%n", areaTerreno);
		System.out.printf("Preço do terreno: %.2f", precoTerreno);
		
		sc.close();

	}

}
