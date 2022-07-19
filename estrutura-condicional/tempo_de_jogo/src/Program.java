import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horaInicial, horaFinal, duracao;

		System.out.print("Hora inicial: ");
		horaInicial = sc.nextInt();
		System.out.print("Hora final: ");
		horaFinal = sc.nextInt();

		duracao = horaFinal > horaInicial ? horaFinal - horaInicial : 24 - horaInicial + horaFinal;

		System.out.printf("O JOGO DUROU %d HORAS(S)%n", duracao);

		sc.close();

	}

}
