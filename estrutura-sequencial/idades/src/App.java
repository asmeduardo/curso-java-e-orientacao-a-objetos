import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomePessoa1, nomePessoa2;
        int idadePessoa1, idadePessoa2;
        double mediaIdades;

        System.out.println("Dados da primeira pessoa:");
        System.out.printf("Nome: ");
        nomePessoa1 = sc.nextLine();
        System.out.printf("Idade: ");
        idadePessoa1 = sc.nextInt();

        System.out.println("Dados da segunda pessoa:");
        System.out.printf("Nome: ");
        sc.nextLine();
        nomePessoa2 = sc.nextLine();
        System.out.printf("Idade: ");
        idadePessoa2 = sc.nextInt();

        mediaIdades = (idadePessoa1 + idadePessoa2) / 2.0;

        System.out.printf("A idade média de %s e %s é de %.1f anos", nomePessoa1, nomePessoa2, mediaIdades);

        sc.close();
    }
}
