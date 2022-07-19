import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1, n2;
		boolean multiplos;

		System.out.println("Digite dois números inteiros:");
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		multiplos = n1 > n2 ? n1 % n2 == 0 : n2 % n1 == 0;

		if (multiplos) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Não são multiplos");
		}

		sc.close();

	}

}
