import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int porcentagem;
        double salario, novoSalario, aumento;

        System.out.print("Digite o salário da pessoa: ");
        salario = sc.nextDouble();

        if (salario <= 1000.00) {
            porcentagem = 20;
        } else if (salario <= 3000.00) {
            porcentagem = 15;
        } else if (salario <= 8000.00) {
            porcentagem = 10;
        } else {
            porcentagem = 5;
        }

        aumento = salario * (porcentagem / 100.00);
        novoSalario = salario + aumento;

        System.out.printf("Novo salário = R$ %.2f%n", novoSalario);
        System.out.printf("Aumento = R$ %.2f%n", aumento);
        System.out.printf("Porcentagem = %d %%", porcentagem);

        sc.close();
    }
}
