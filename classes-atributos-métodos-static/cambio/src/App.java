import java.util.Locale;
import java.util.Scanner;

import utils.CurrentyConverter;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do dólar? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("Quantos dólares serão comprados? ");
        double amount = sc.nextDouble();

        System.out.printf("Valor a ser pago em reais = %.2f",
                CurrentyConverter.dollarToReal(dollarPrice, amount));

        sc.close();
    }
}
