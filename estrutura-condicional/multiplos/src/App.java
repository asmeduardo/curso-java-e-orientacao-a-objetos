import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Digite dois números inteiros:");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x != 0 && y != 0 && (x % y == 0 || y % x == 0)) {
            System.out.println("São múltiplos");
        } else if (x == 0 || y == 0) {
            System.out.println("Não é possível dividir por zero");
        } else {
            System.out.println("Não são múltiplos");
        }

        sc.close();
    }
}
