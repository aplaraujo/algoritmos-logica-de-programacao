import java.util.Locale;
import java.util.Scanner;

public class Operadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quant_minutos, excedente;
        double total;

        System.out.print("Digite a quantidade de minutos: ");
        quant_minutos = sc.nextInt();

        if (quant_minutos <= 100) {
            System.out.println("Valor a pagar: R$ 50.00");
        } else {
            excedente = quant_minutos - 100;
            total = 50 + (excedente * 2);
            System.out.println("Valor a pagar: R$ " + String.format("%.2f", total));
        }

        sc.close();
    }
}