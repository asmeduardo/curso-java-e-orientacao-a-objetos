import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x, y, soma;

        System.out.print("Digite o valor de X: ");
        x = sc.nextInt();

        System.out.print("Digite o valor de Y: ");
        y = sc.nextInt();

        soma = x + y;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
