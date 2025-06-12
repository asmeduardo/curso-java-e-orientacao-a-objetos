import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, areaQuadrado, areaTriangulo, areaTrapezio;

        System.out.print("Digite a medida A: ");
        A = sc.nextDouble();

        System.out.print("Digite a medida B: ");
        B = sc.nextDouble();

        System.out.print("Digite a medida C: ");
        C = sc.nextDouble();

        areaQuadrado = Math.pow(A, 2.0);
        areaTriangulo = (A * B) / 2.0;
        areaTrapezio = (A + B) * C / 2.0;

        System.out.printf("AREA DO QUADRADO = %.4f%n", areaQuadrado);
        System.out.printf("AREA DO TRIÂNGULO = %.4f%n", areaTriangulo);
        System.out.printf("AREA DO TRAPEZIO = %.4f", areaTrapezio);

        sc.close();
    }
}
