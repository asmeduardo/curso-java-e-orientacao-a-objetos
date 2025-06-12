import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char escala;
        double temperatura, tempFahrenheit, tempCelsius;

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        escala = sc.next().charAt(0);

        if (escala == 'C') {
            System.out.print("Digite a temperatura em Celsius: ");
            tempCelsius = sc.nextDouble();
            temperatura = 32 + 9.0/5.0 * tempCelsius;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", temperatura);
        } else {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            tempFahrenheit = sc.nextDouble();
            temperatura = 5.0/9.0 * (tempFahrenheit - 32);
            System.out.printf("Temperatura equivalente em Celsius: %.2f", temperatura);
        }

        sc.close();
    }
}
