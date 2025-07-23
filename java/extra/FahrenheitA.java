package extra;

import java.util.Locale;
import java.util.Scanner;

public class FahrenheitA {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double tempC, tempF;

        System.out.print("Digite uma temperatura em Celsius: ");
        tempC = sc.nextDouble();

        tempF = f(tempC);

        System.out.printf("Temperatura equivalente em Fahrenheit: %.0f", tempF);

        sc.close();
    }

    public static double f(double c) {
        return c * (9/5) + 32;
    }
}
