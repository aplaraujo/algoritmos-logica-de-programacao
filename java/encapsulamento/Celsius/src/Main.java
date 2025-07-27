import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double tempF, tempC;

        System.out.print("Digite a temperatura em Fahrenheit: ");
        tempF = sc.nextDouble();
        Celsius celsius = new Celsius(tempF);

        tempC = celsius.tempC();

        System.out.println();
        System.out.printf("Temperatura equivalente em Celsius: %.1f", tempC);
        sc.close();
    }
}