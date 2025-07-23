package extra;

import extra.util.A2;

import java.util.Locale;
import java.util.Scanner;

public class FahrenheitC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double c, f;

        System.out.print("Digite uma temperatura em Celsius: ");
        c = sc.nextDouble();

        f = A2.tempF(c);

        System.out.printf("Temperatura equivalente em Fahrenheit: %.1f", f);

        sc.close();
    }
}
