import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int x;

		System.out.print("Digite o valor de X: ");
		x = in.nextInt();

		for (int i = 1; i < x; i = i + 2) {

			System.out.println(i);

		}

		if (x % 2 != 0)
			System.out.println(x);

		in.close();

	}

}
