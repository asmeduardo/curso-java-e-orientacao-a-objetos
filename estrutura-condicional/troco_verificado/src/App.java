import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtdComprada;
        double precoProduto, dinheiroRecebido, totalDaCompra, troco;

        System.out.print("Preço unitário do produto: ");
        precoProduto = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        qtdComprada = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        dinheiroRecebido = sc.nextDouble();

        totalDaCompra = precoProduto * qtdComprada;
        troco = dinheiroRecebido - totalDaCompra;

        if (totalDaCompra > dinheiroRecebido) {
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", (totalDaCompra - dinheiroRecebido));
        } else {
            System.out.printf("TROCO = %.2f", troco);
        }

        sc.close();
    }
}
