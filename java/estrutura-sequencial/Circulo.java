import entities.ObterCirculo;
import java.util.Locale;
import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ObterCirculo circulo;
        circulo = new ObterCirculo();

        System.out.print("Digite o valor do raio do circulo: ");
        circulo.raio = sc.nextDouble();

        System.out.println(circulo);

        sc.close();
    }
}
