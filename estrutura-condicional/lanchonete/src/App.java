import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double valorProduto;

        System.out.print("Código do produto comprado: ");
        codigo = sc.nextInt();

        if(codigo == 1) {
            valorProduto = 5.00;
        } else if (codigo == 2) {
            valorProduto = 3.50;
        } else if (codigo == 3) {
            valorProduto = 4.80;
        } else if (codigo == 4) {
            valorProduto = 8.90;
        } else {
           valorProduto = 7.32;
        }

        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextInt();

        System.out.printf("Valor a pagar: R$ %.2f", (quantidade * valorProduto));

        sc.close();
    }
}
