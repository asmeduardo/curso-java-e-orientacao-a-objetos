import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x, y, z;

        System.out.print("Primeiro valor: ");
        x = sc.nextInt();
        System.out.print("Segundo valor: ");
        y = sc.nextInt();
        System.out.print("Terceiro valor: ");
        z = sc.nextInt();

        if(x < y && x < z) {
            System.out.println("MENOR = " + x);
        } else if (y < x && y < z) {
           System.out.println("MENOR = " + y); 
        } else {
            System.out.println("MENOR = " + z); 
        }

        sc.close();
    }
}
