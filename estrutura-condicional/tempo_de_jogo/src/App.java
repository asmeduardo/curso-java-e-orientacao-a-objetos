import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;

        System.out.print("Hora inicial: ");
        horaInicial = sc.nextInt();

        System.out.print("Hora final: ");
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else if (horaInicial > horaFinal) {
            duracao = 24 - horaInicial + horaFinal;
        } else {
            duracao = 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", duracao);

        sc.close();
    }
}
