import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char repetir;
        double tempCelsius, tempFahrenheit;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            tempCelsius = sc.nextDouble();
            tempFahrenheit = 9 * tempCelsius / 5.0 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", tempFahrenheit);
            System.out.print("Deseja repetir (s/n): ");
            repetir = sc.next().charAt(0);
        } while (repetir == 's');

        sc.close();
    }
}
