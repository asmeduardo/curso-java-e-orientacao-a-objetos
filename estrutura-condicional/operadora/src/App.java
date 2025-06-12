import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtdMinutos;
        double valorPagar;

        System.out.print("Digite a quantidade de minutos: ");
        qtdMinutos = sc.nextInt();

        valorPagar = (qtdMinutos > 100) ? 50.00 + ((qtdMinutos - 100) * 2.00) : 50.00;

        System.out.printf("Valor a pagar: %.2f", valorPagar);

        sc.close();
    }
}
