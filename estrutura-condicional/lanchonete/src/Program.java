import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codigoProduto, qtdProduto;
		double valorCompra;

		System.out.print("Código do produto comprado: ");
		codigoProduto = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		qtdProduto = sc.nextInt();

		if (codigoProduto == 1) {
			valorCompra = 5.00 * qtdProduto;
		} else if (codigoProduto == 2) {
			valorCompra = 3.50 * qtdProduto;
		} else if (codigoProduto == 3) {
			valorCompra = 4.80 * qtdProduto;
		} else if (codigoProduto == 4) {
			valorCompra = 8.90 * qtdProduto;
		} else {
			valorCompra = 7.32 * qtdProduto;
		}

		System.out.printf("Valor a pagar: R$ %.2f", valorCompra);

		sc.close();

	}

}
