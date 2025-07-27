import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double dolar, real;
        System.out.print("Digite o valor em dólares: ");
        dolar = sc.nextDouble();
        Real conversao = new Real(dolar);

        real = conversao.dolarParaReal();

        System.out.println();
        System.out.printf("Valor convertido para reais: R$ %.2f", real);

        sc.close();
    }
}