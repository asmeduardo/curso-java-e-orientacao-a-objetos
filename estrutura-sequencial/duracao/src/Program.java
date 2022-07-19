import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int segundos, h, m, s, resto;

		System.out.print("Digite a duração em segundos: ");
		segundos = sc.nextInt();

		h = segundos / 3600;
		resto = segundos % 3600;
		m = resto / 60;
		s = resto % 60;

		System.out.printf("%d:%d:%d", h, m, s);

		sc.close();

	}

}
