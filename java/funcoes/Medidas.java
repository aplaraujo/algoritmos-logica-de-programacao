import java.util.Locale;
import java.util.Scanner;

public class Medidas {
    public static double Area_Quad(double a) {
        return a * a;
    } 

    public static double Area_Tri(double a, double b) {
        return (a * b) / 2;
    }

    public static double Area_Tra(double a, double b, double c) {
        return ((a + b) * c) / 2;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, area_quadrado, area_triangulo, area_trapezio;

        System.out.print("Digite a medida A: ");
        a = sc.nextDouble();
        System.out.print("Digite a medida B: ");
        b = sc.nextDouble();
        System.out.print("Digite a medida C: ");
        c = sc.nextDouble();

        area_quadrado = Area_Quad(a);
        area_triangulo = Area_Tri(a, b);
        area_trapezio = Area_Tra(a, b, c);

        System.out.printf("AREA DO QUADRADO = %.4f %n", area_quadrado);
        System.out.printf("AREA DO TRIANGULO = %.4f %n", area_triangulo);
        System.out.printf("AREA DO TRAPEZIO = %.4f", area_trapezio);

        sc.close();
    }
}
