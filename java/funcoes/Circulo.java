import java.util.Locale;
import java.util.Scanner;

public class Circulo {

    public static double Obter_Area(double r) {
        return (3.14159 * (r * r));
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area;

        System.out.print("Digite o valor do raio do circulo: ");
        raio = sc.nextDouble();

        area = Obter_Area(raio);

        System.out.println("AREA = " + String.format("%.3f", area));

        sc.close();
    }
}
