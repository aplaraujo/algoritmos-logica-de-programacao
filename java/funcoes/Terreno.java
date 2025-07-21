import java.util.Locale;
import java.util.Scanner;

public class Terreno {

    public static double Obter_Terreno(double l, double c) {
        return l * c;
    }

    public static double Obter_Preco(double a, double m) {
        return a * m;
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura, comp, metro, area, preco;

        System.out.print("Digite a largura do terreno: ");
        largura = sc.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        comp = sc.nextDouble();
        System.out.print("Digite o valor do metro quadrado: ");
        metro = sc.nextDouble();

        area = Obter_Terreno(largura, comp);
        preco = Obter_Preco(area, metro);

        System.out.printf("Area do terreno = %.2f %n", area);
        System.out.printf("Preco do terreno = %.2f %n", preco);

        sc.close();
    }
}