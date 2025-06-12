import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distanciaPercorrida;
        double combustivelGasto, consumoMedio;

        System.out.print("Distância percorrida: ");
        distanciaPercorrida = sc.nextInt();

        System.out.print("Combustível gasto: ");
        combustivelGasto = sc.nextDouble();

        consumoMedio = distanciaPercorrida / combustivelGasto;

        System.out.printf("Consumo médio = %.3f", consumoMedio);

        sc.close();
    }
}
