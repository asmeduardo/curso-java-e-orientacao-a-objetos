import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtdProduto;
		double precoProduto, dinheiroRecebido, valorCompra, valorRestante, troco;

		System.out.print("Preço unitário do produto: ");
		precoProduto = sc.nextDouble();
		System.out.print("Quantidade do produto: ");
		qtdProduto = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinheiroRecebido = sc.nextDouble();

		valorCompra = precoProduto * qtdProduto;

		if (valorCompra > dinheiroRecebido) {
			valorRestante = valorCompra - dinheiroRecebido;

			System.out.printf("DINHEIRO INSULFICIENTE. FALTAM %.2f REAIS", valorRestante);
		} else {
			troco = dinheiroRecebido - valorCompra;

			System.out.printf("TROCO = %.2f", troco);
		}

		sc.close();

	}

}
