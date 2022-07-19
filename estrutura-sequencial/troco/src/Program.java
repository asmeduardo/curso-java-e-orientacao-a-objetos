import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Preço unitário do produto: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		int qtdComprada = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		double dinheiroRecebido = sc.nextDouble();
		
		double troco = dinheiroRecebido - preco * qtdComprada;
		
		System.out.printf("TROCO = %.2f", troco);
		
		sc.close();

	}

}
