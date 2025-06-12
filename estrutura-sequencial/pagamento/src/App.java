import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeFuncionario;
        double valorPorHora, valorPagamento;
        int horasTrabalhadas;

        System.out.print("Nome: ");
        nomeFuncionario = sc.nextLine();

        System.out.print("Valor por hora: ");
        valorPorHora = sc.nextDouble();

        System.out.print("Horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        valorPagamento = valorPorHora * horasTrabalhadas;

        System.out.printf("O pagamento para %s deve ser %.2f", nomeFuncionario, valorPagamento);

        sc.close();
    }
}
