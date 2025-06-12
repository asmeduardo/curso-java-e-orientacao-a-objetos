import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int soma = 0, n;

        System.out.print("Quantos números inteiros você vai digitar:");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            soma += sc.nextInt();
        }

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
