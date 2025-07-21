import java.util.Locale;
import java.util.Scanner;

public class Troco {

    public static double Obter_Total(double a, double b) {
        return ((double) a * b);
    }

    public static double Obter_Troco(double a, double b) {
        return a - b;
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double preco, dinheiro, total, troco;
        int quant;

        System.out.print("Preço unitário do produto: ");
        preco = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        quant = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        dinheiro = sc.nextDouble();

        total = Obter_Total(preco, quant);
        troco = Obter_Troco(dinheiro, total);

        System.out.println("TROCO = " + String.format("%.2f", troco));

        sc.close();
    }
}
