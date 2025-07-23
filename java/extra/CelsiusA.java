package extra;

import java.util.Locale;
import java.util.Scanner;

public class CelsiusA {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double f, c;

        System.out.print("Digite uma temperatura em Fahrenheit: ");
        f = sc.nextDouble();

        c = tempC(f);

        System.out.printf("Temperatura equivalente em Celsius: %.0f", c);

        sc.close();
    }

    public static double tempC(double f) {
        return ((f - 32) * 5) / 9;
    }
}
