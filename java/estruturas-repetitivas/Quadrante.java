
import java.util.Locale;
import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.println("Digite os valores das coordenadas X e Y: ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        do {
            if (x > 0 && y > 0) {
                System.out.println("QUADRANTE Q1");
            }

            if (x < 0 && y > 0) {
                System.out.println("QUADRANTE Q2");
            }

            if (x < 0 && y < 0) {
                System.out.println("QUADRANTE Q3");
            }

            if (x > 0 && y < 0) {
                System.out.println("QUADRANTE Q4");
            }

            System.out.println("Digite os valores das coordenadas X e Y: ");
            x = sc.nextDouble();
            y = sc.nextDouble();
        } while (x != 0 && y != 0);
    }
}
