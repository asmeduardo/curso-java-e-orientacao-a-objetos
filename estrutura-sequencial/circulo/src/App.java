import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double PI = 3.14159, raio, area;

        System.out.print("Digite o valor do raio do circulo: ");
        raio = sc.nextDouble();

        area = PI * Math.pow(raio, 2.0);
        System.out.printf("ÁREA = %.3f", area);
        
        sc.close();
    }
}
