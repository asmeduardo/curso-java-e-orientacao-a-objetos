import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Entre com a largura e altura do retângulo:");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        System.out.printf("ÁREA = %.2f%n", retangulo.area());
        System.out.printf("PERÍMETRO = %.2f%n", retangulo.perimeter());
        System.out.printf("DIAGONAL = %.2f", retangulo.diagonal());

        sc.close();
    }
}
