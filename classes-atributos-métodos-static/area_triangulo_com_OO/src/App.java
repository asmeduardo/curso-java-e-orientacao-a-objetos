import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double areaX, areaY;

        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();

        System.out.println("Enter the measures of triangle X:");
        t1.a = sc.nextDouble();
        t1.b = sc.nextDouble();
        t1.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        t2.a = sc.nextDouble();
        t2.b = sc.nextDouble();
        t2.c = sc.nextDouble();

        areaX = t1.area();
        areaY = t2.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.printf("Larger area: X");
        } else {
            System.out.printf("Larger area: Y");
        }

        sc.close();
    }
}
