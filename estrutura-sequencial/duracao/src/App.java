import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int duracao, horas, minutos, segundos;
        
        System.out.print("Digite a duracao em segundos: ");
        duracao = sc.nextInt();

        horas = duracao / 3600;
        minutos = (duracao - (horas * 3600)) / 60;
        segundos = duracao - (horas * 3600) - (minutos * 60);

        System.out.printf("%d:%d:%d", horas, minutos, segundos);

        sc.close();
    }
}
