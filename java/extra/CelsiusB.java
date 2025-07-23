package extra;

import extra.util.B1;

import java.util.Locale;
import java.util.Scanner;

public class CelsiusB {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        B1 celsius = new B1();
        double f, c;

        System.out.print("Digite uma temperatura em Fahrenheit: ");
        f = sc.nextDouble();

        c = celsius.tempC(f);

        System.out.printf("Temperatura equivalente em Celsius: %.0f", c);

        sc.close();
    }
}
