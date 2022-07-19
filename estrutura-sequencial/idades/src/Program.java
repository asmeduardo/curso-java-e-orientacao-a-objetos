import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		String nomePrimeiraPessoa = sc.nextLine();
		System.out.print("Idade: ");
		int idade1 = sc.nextInt();
		System.out.println("Dados da segunda pessoa:");
		System.out.print("Nome: ");
		sc.nextLine();
		String nomeSegundaPessoa = sc.nextLine();
		System.out.print("Idade: ");
		int idade2 = sc.nextInt();
		
		double idadeMedia = (double)(idade1 + idade2) / 2;
		
		System.out.printf("A idade média de %s e %s é de %.1f anos", nomePrimeiraPessoa, nomeSegundaPessoa, idadeMedia);
		
		sc.close();

	}

}
