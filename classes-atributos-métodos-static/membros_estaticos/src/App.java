import java.util.Locale;
import java.util.Scanner;

import utils.GeometryUtils;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.printf("Circumference: %.2f%n", GeometryUtils.circumference(radius));
        System.out.printf("Volume: %.2f%n", GeometryUtils.volume(radius));

        sc.close();
    }
}
