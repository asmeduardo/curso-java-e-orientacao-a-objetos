import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int soma = 0, x = sc.nextInt();

        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
