import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura, comprimento, area, valorMetroQuadrado, valorTerreno;

        System.out.print("Digite a largura do terreno:");
        largura = sc.nextDouble();

        System.out.print("Digite o comprimeto do terreno:");
        comprimento = sc.nextDouble();

        System.out.print("Digite o valor do metro quadrado:");
        valorMetroQuadrado = sc.nextDouble();

        area = largura * comprimento;
        valorTerreno = area * valorMetroQuadrado;

        System.out.printf("Area do terreno = %.2f%n", area);
        System.out.printf("Preço do terreno = %.2f", valorTerreno);

        sc.close();
    }
}
