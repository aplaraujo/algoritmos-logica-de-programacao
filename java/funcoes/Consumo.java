import java.util.Locale;
import java.util.Scanner;

public class Consumo {

    public static double Obter_Consumo(double d, double c) {
        return ((double) d / c);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distancia;
        double combustivel, consumo;

        System.out.print("Distancia percorrida: ");
        distancia = sc.nextInt();
        System.out.print("Combustível gasto: ");
        combustivel = sc.nextDouble();

        consumo = Obter_Consumo(distancia, combustivel);

        System.out.printf("Consumo medio = %.3f", consumo);

        sc.close();
    }
    
}
