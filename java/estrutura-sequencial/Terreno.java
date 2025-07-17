
import java.util.Locale;
import java.util.Scanner;

public class Terreno {
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

        area = largura * comp;
        preco = area * metro;

        System.out.println("Area do terreno = " + String.format("%.2f", area));
        System.out.println("Preco do terreno = " + String.format("%.2f", preco));

    }
}
