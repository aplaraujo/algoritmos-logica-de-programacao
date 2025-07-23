package extra;

import extra.util.A1;
import java.util.Locale;
import java.util.Scanner;

public class FahrenheitB {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        A1 fahrenheit = new A1();

        double c, f;

        System.out.print("Digite uma temperatura em Celsius: ");
        c = sc.nextDouble();

        f = fahrenheit.tempF(c);

        System.out.printf("Temperatura equivalente em Fahrenheit: %.1f", f);

        sc.close();
    }
}
