
import entities.ObterRetangulo;
import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ObterRetangulo retangulo;
        retangulo = new ObterRetangulo();

        System.out.print("Base do retangulo: ");
        retangulo.base = sc.nextDouble();
        System.out.print("Altura do retangulo: ");
        retangulo.altura = sc.nextDouble();

        System.out.println(retangulo);

        sc.close();
    }
}
