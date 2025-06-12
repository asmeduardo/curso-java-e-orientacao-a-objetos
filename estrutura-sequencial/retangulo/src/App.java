import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double base, altura, area, perimetro, diagonal;

        System.out.print("Base do retângulo:");
        base = sc.nextDouble();

        System.out.print("Altura do retângulo:");
        altura = sc.nextDouble();

        area = base * altura;
        perimetro = 2.0 * (base + altura);
        diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));

        System.out.printf("ÁREA = %.4f%n", area);
        System.out.printf("PERÍMETRO = %.4f%n", perimetro);
        System.out.printf("DIAGONAL = %.4f", diagonal);

        sc.close();
    }
}
