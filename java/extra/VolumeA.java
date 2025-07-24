package extra;

import java.util.Locale;
import java.util.Scanner;

public class VolumeA {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double altura, raio, v;

        System.out.print("Digite o raio de uma lata de óleo: ");
        raio = sc.nextDouble();
        System.out.print("Digite a altura de uma lata de óleo: ");
        altura = sc.nextDouble();

        v = volume(raio, altura);
        System.out.printf("Volume da lata de óleo: %.4f", v);

        sc.close();
    }

    public static double volume(double r, double a) {
        return 3.14159 * Math.pow(r, 2) * a;
    }
}
