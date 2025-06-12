import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade;
        double precoProduto, dinheiroRecebido, valorTotal, troco;

        System.out.print("Preço unitário do produto: ");
        precoProduto = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextInt();
        
        System.out.print("Dinheiro recebido: ");
        dinheiroRecebido = sc.nextDouble();

        valorTotal = precoProduto * quantidade;
        troco = dinheiroRecebido - valorTotal;

        System.out.printf("TROCO = %.2f", troco);

        sc.close();
    }
}
