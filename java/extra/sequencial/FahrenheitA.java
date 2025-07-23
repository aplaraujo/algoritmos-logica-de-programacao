package extra.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class FahrenheitA {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double c, f;

        System.out.print("Entre com a temperatura em C: ");
        c = sc.nextDouble();

        f = F(c);

        System.out.printf("Temperatura em Fahrenheit: %.1f", f);

        sc.close();
    }

    public static double F(double C) {
        return C * (9 / 5) + 32;
    }
}
