
import entities.ObterConsumo;
import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ObterConsumo consumo = new ObterConsumo();

        System.out.print("Distancia percorrida: ");
        consumo.distancia = sc.nextInt();
        System.out.print("Combustível gasto: ");
        consumo.combustivel = sc.nextDouble();

        System.out.println(consumo);

        sc.close();
    }
}
