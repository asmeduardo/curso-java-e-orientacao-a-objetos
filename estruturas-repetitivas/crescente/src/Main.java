import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.println("Digite dois números:");
		x = sc.nextInt();
		y = sc.nextInt();

		while (x != y) {

			System.out.println(x > y ? "DECRESCENTE!" : "CRESCENTE!");

			System.out.println("Digite outros dois números:");
			x = sc.nextInt();
			y = sc.nextInt();

		}

		sc.close();
	}
}