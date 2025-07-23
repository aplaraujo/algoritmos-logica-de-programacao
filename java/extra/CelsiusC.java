package extra;

import extra.util.B2;

import java.util.Locale;
import java.util.Scanner;

public class CelsiusC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double f, c;

        System.out.print("Digite uma temperatura em Fahrenheit: ");
        f = sc.nextDouble();

        c = B2.tempC(f);

        System.out.printf("Temperatura equivalente em Celsius: %.0f", c);

        sc.close();
    }
}
