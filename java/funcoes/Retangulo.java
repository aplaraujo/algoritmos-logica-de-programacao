import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

    public static double Obter_Area(double base, double altura) {
        return base * altura;
    }

    public static double Obter_Perimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    public static double Obter_Diagonal(double base, double altura) {
        return Math.sqrt((base * base) + (altura * altura));
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double base, altura, area, perimetro, diagonal;

        System.out.print("Base do retangulo: ");
        base = sc.nextDouble();
        System.out.print("Altura do retangulo: ");
        altura = sc.nextDouble();

        area = Obter_Area(base, altura);
        perimetro = Obter_Perimetro(base, altura);
        diagonal = Obter_Diagonal(base, altura);

        System.out.println("AREA = " + String.format("%.4f", area));
        System.out.println("PERIMETRO = " + String.format("%.4f", perimetro));
        System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));

        sc.close();
    }
}
