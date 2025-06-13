import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Nome do aluno: ");
        student.name = sc.nextLine();
        System.out.print("Primeira nota: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Segunda nota: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Terceira nota: ");
        student.grade3 = sc.nextDouble();

        double finalGrade = student.finalGrade();

        System.out.printf("NOTA FINAL = %.2f%n", finalGrade);

        if (student.finalGrade() < 60.0) {
            System.out.println("REPROVADO");
            System.out.printf("FALTARAM %.2f PONTOS", student.missingPoints());
        } else {
            System.out.println("APROVADO");
        }

        sc.close();
    }
}
