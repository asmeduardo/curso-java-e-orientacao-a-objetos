import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Nome: ");
        emp.name = sc.nextLine();
        System.out.print("Salário bruto: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Imposto: ");
        emp.tax = sc.nextDouble();

        System.out.println("Funcionário: " + emp);

        System.out.print("Qual a porcentagem para aumentar o salário? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println("Dados atualizados: " + emp);

        sc.close();
    }
}
